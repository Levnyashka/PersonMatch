package ru.vtb.msa.person.serviceImpl;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.stereotype.Service;
import ru.vtb.msa.person.serviceImpl.converterJSON.input.AddressRegistration;
import ru.vtb.msa.person.serviceImpl.converterJSON.input.PersonInput;
import ru.vtb.msa.person.serviceImpl.converterJSON.input.PersonDocumentIdentity;
import ru.vtb.msa.person.serviceImpl.converterJSON.input.PersonMatchInputJSON;
import ru.vtb.msa.person.serviceImpl.converterJSON.output.*;
import ru.vtb.msa.person.serviceImpl.converterJSON.util.ContainerCrossReference;
import ru.vtb.msa.person.serviceImpl.converterJSON.util.ContainerValue;
import ru.vtb.msa.person.serviceImpl.converterJSON.util.ContainerValueLanguageID;
import ru.vtb.msa.person.wsdl.dataquality.PersonMatchInput;
import ru.vtb.msa.person.wsdl.dataquality.PersonMatchOutput;
import ru.vtb.msa.person.wsdl.xml.TypeCheckObject;
import ru.vtb.msa.person.wsdl.xml.swipersonmatchinputio.Contact;
import ru.vtb.msa.person.wsdl.xml.swipersonmatchinputio.SwiPersonMatchInputIO;
import ru.vtb.msa.person.wsdl.xml.swipersonmatchoutputio.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ConverterPersonMatch {



    public PersonMatchInput ConvertToXml(PersonMatchInputJSON json){

        /*
        * Не использованные поля в WSDL
        //personMatchInputIO.setThreshold();
        //personMatchInputIO.setMessageId();
        //personMatchInputIO.setLocale();
        //personMatchInputIO.setEnterpriseServerName();
        //personMatchInputIO.setLanguage();
        */
        PersonMatchInput personMatchInput = new PersonMatchInput();
        SwiPersonMatchInputIO personMatchInputIO = new SwiPersonMatchInputIO();
        Contact contact = new Contact();

        // BusinessData
        contact.setSearchType(json.getSearchType());

        //PersonInput
        if(json.getPerson() != null){
            PersonInput person = json.getPerson();

            contact.setFirstName(person.getSurname());
            contact.setLastName(person.getFirstName());
            contact.setMiddleName(person.getMiddleName());
            contact.setBirthDate(person.getBirthDateTime());
            contact.setINN(person.getTIN());
            contact.setFullPhone(person.getPhoneNumber());
            contact.setEmail(person.getEmail());

            //AddressRegistration
            if(json.getPerson().getAddressRegistration() != null){
                AddressRegistration addressRegistration = person.getAddressRegistration();

                contact.setInsPersonalNotFormAddrName(addressRegistration.getNotFormAddrName());
                contact.setINSPersonalCountry(addressRegistration.getCountry());
                contact.setInsPersonalPostalCode(addressRegistration.getZipCode());
                contact.setInsPersonalRegion(addressRegistration.getRegion());
                contact.setInsPersonalPrefState(addressRegistration.getStateNumber());
                contact.setInsPersonalPrefDistrict(addressRegistration.getRegion());
                contact.setINSPersonalPrefCity(addressRegistration.getCity());
                contact.setInsPersonalPrefSettlement(addressRegistration.getLocation());
                contact.setInsPersonalPrefStreet(addressRegistration.getStreet());
                contact.setInsPersonalHouse(addressRegistration.getHouse());
                contact.setInsPersonalHousing(addressRegistration.getHousing());
                contact.setInsPersonalBuilding(addressRegistration.getBuilding());
                contact.setInsPersonalApartmentNumber(addressRegistration.getApartmentNumber());
            }

            //PersonDocumentIdentity
            if(json.getPerson().getPersonDocumentIdentity() != null){
                PersonDocumentIdentity personDocumentIdentity = person.getPersonDocumentIdentity();

                contact.setSeries(personDocumentIdentity.getSeries());
                contact.setNumber(personDocumentIdentity.getNumber());
                contact.setDulIssueDate(personDocumentIdentity.getIssueDate());
                contact.setDulType(personDocumentIdentity.getTypeCode());

            }
        }

        personMatchInputIO.setContact(contact);
        personMatchInput.setSwiPersonMatchInputIO(personMatchInputIO);
        return personMatchInput;
    }

    public PersonMatchOutputJSON ConvertToJSON(PersonMatchOutput xml){
        // Candidate - клиент из МДМ
        // Person - Клиент на выходе микросервиса
        PersonMatchOutputJSON personMatchOutputJSON = new PersonMatchOutputJSON();
        ArrayList<PersonOutput> PersonList = new ArrayList<>();
        int i = 0;

        // !!! Добавить проверки на наличие контейнеров
        // Блок клиента
        for (Candidate candidate : xml.getSwiPersonMatchOutputIO().getDriver().getListOfCandidate().getCandidate()){
            PersonOutput person = new PersonOutput();

            person.setPartyUId(candidate.getPartyUId());
            person.setMatchScore(Integer.toString(i++));
            person.setSurName(new ContainerValueLanguageID(candidate.getLastName(),"RUS"));
            person.setFirstName(new ContainerValueLanguageID(candidate.getFirstName(),"RUS"));
            person.setMiddleName(new ContainerValueLanguageID(candidate.getMiddleName(),"RUS"));
            person.setBirthDate(candidate.getBirthDate());
            person.setUpdateDate(candidate.getUpdateDate());
            person.setBirthPlace(candidate.getBirthPlace());
            person.setCitizenship(candidate.getCitizenship());
            person.setMf(candidate.getMF());
            person.setTin(candidate.getINN());
            person.setLmfGenitive(new ContainerValueLanguageID(candidate.getMiddleName(),"RUS"));
            person.setLmfDative(new ContainerValueLanguageID(candidate.getLFMDative(),"RUS"));
            person.setLmfAblative(new ContainerValueLanguageID(candidate.getLFMAblative(),"RUS"));
            person.setCreatedExternalSystem(candidate.getCreatedExternalSystem());
            person.setMaritalStatus(candidate.getMaritalStatus());

            // Блок адресов
            ArrayList<PersonalAddress> personAddresList = new ArrayList<>(10);
            for(ContactINSPersonalAddress candidateAddress : clearList(candidate.getListOfContactINSPersonalAddress().getContactINSPersonalAddress())){
                PersonalAddress personAddress = new PersonalAddress();

                personAddress.setTrustFlag(candidateAddress.getTrustFlag());
                personAddress.setPersonalAddressType(candidateAddress.getINSPersonalAddressType());
                personAddress.setAddressName(candidateAddress.getINSPersonalAddressName());
                personAddress.setNotFormAddrName(candidateAddress.getINSPersonalNotFormAddrName());
                personAddress.setCountry(candidateAddress.getINSPersonalCountry());
                personAddress.setZipCode(candidateAddress.getINSPersonalPostalCode());
                personAddress.setStateNumber(candidateAddress.getINSPersonalRegion());
                personAddress.setStateType(candidateAddress.getINSPersonalPrefStateType());
                personAddress.setPersonalPrefState(candidateAddress.getINSPersonalPrefState());
                personAddress.setDistrictType(candidateAddress.getINSPersonalPrefDistrictType());
                personAddress.setPersonalPrefDistrict(candidateAddress.getINSPersonalPrefDistrictType());
                personAddress.setCityType(candidateAddress.getINSPersonalPrefCityType());
                personAddress.setPersonalPrefCity(candidateAddress.getINSPersonalPrefCity());
                personAddress.setStreetType(candidateAddress.getINSPersonalPrefStreetType());
                personAddress.setSettlementType(candidateAddress.getINSPersonalPrefSettlementType());
                personAddress.setPersonalPrefSettlement(candidateAddress.getINSPersonalPrefSettlement());
                personAddress.setPersonalPrefStreet(candidateAddress.getINSPersonalPrefStreet());
                personAddress.setHouse(candidateAddress.getINSPersonalHouse());
                personAddress.setHousing(candidateAddress.getINSPersonalHousing());
                personAddress.setBuilding(candidateAddress.getINSPersonalBuilding());
                personAddress.setApartamentNumber(candidateAddress.getINSPersonalApartmentNumber());
                personAddress.setKladrCode(candidateAddress.getINSPersonalKLADRCode());
                personAddress.setOkatoCode(candidateAddress.getINSPersonalOKATOCode());
                personAddress.setStartDate(candidateAddress.getINSPersonalStartDate());
                personAddress.setEndDate(candidateAddress.getINSPersonalEndDate());
                personAddress.setLoginExternalSystem(candidateAddress.getLoginExternalSystem());
                personAddress.setNameExternalSystem(candidateAddress.getNameExternalSystem());
                personAddress.setUpdateDate(candidateAddress.getUpdateDate());

                personAddresList.add(personAddress);
            }

            // Блок кросс сылок
            // !!! Проверка дат !!!
            ArrayList<ContainerCrossReference> personCrosRefList = new ArrayList<>(10);
            for(CIFContactReference candidateCrosRef : candidate.getListOfCIFContactReference().getCIFContactReference()){
                if(isUpDate(candidateCrosRef.getEndDate())){
                    ContainerCrossReference personCrossRef = new ContainerCrossReference();
                    personCrossRef.setExternalId(candidateCrosRef.getExternalId());
                    personCrossRef.setSystemNumber(candidateCrosRef.getSystemNumber());
                    personCrosRefList.add(personCrossRef);
                }
            }

            // Блок Документы клиента
            ArrayList<ContactIdentity> personContactIdentityList = new ArrayList<>(10);
            for(ContactPUBContactIdentity candidatePUBContactIdentity : clearList(candidate.getListOfContactPUBContactIdentity().getContactPUBContactIdentity())) {
                ContactIdentity personContactIdentity = new ContactIdentity();

                personContactIdentity.setTrustFlag(candidatePUBContactIdentity.getTrustFlag());
                personContactIdentity.setType(candidatePUBContactIdentity.getType());
                personContactIdentity.setSeries(candidatePUBContactIdentity.getSeries());
                personContactIdentity.setNumber(candidatePUBContactIdentity.getNumber());
                personContactIdentity.setCountryIssue(candidatePUBContactIdentity.getCountryIssue());
                personContactIdentity.setIssued(candidatePUBContactIdentity.getIssued());
                personContactIdentity.setIssuedDate(candidatePUBContactIdentity.getIssueDate());
                personContactIdentity.setExpirationDate(candidatePUBContactIdentity.getExpirationDate());
                personContactIdentity.setDivisionCode(candidatePUBContactIdentity.getDivisionCode());
                personContactIdentity.setComment(candidatePUBContactIdentity.getComment());
                personContactIdentity.setStartDate(candidatePUBContactIdentity.getStartDate());
                personContactIdentity.setEndDate(candidatePUBContactIdentity.getEndDate());
                personContactIdentity.setLoginExternalSystem(candidatePUBContactIdentity.getLoginExternalSystem());
                personContactIdentity.setNameExternalSystem(candidatePUBContactIdentity.getNameExternalSystem());
                personContactIdentity.setUpdateDate(candidatePUBContactIdentity.getUpdateDate());

                personContactIdentityList.add(personContactIdentity);
            }

            // Блок телефоны клиента
            ArrayList<PhoneCommunication> personPhoneList = new ArrayList<>(10);
            for(ContactAlternatePhone candidatePhone : clearList(candidate.getListOfContactAlternatePhone().getContactAlternatePhone())) {
                PhoneCommunication personPhone = new PhoneCommunication();

                personPhone.setTrustFlag(candidatePhone.getTrustFlag());
                personPhone.setPhoneType(candidatePhone.getPhoneType());
                personPhone.setOperatorName(candidatePhone.getOperatorName());
                personPhone.setPhoneRegion(candidatePhone.getPhoneRegion());
                personPhone.setStartDate(candidatePhone.getStartDate());
                personPhone.setEndDate(candidatePhone.getEndDate());
                personPhone.setLoginExternalSystem(candidatePhone.getLoginExternalSystem());
                personPhone.setNameExternalSystem(candidatePhone.getNameExternalSystem());
                personPhone.setUpdateDate(candidatePhone.getUpdateDate());

                personPhoneList.add(personPhone);
            }

            // Возможно следует сделать один большой блок с проходом по  .../ListOfContact_Segment/Contact_Segment/Value , где реализовать различные проверки
/////////////////////////////////////// Очень ПЛОХО !!!
            // Блок Бывший клиент банка
            ArrayList<ContainerValue> personFormerCustomerList = new ArrayList<>(10);
            // Возможно не правильный мапинг !!! поменять классы в цикле
            for(ContactSegment candidateSegment : candidate.getListOfContactSegment().getContactSegment()) {
                personFormerCustomerList.add(new ContainerValue(candidateSegment.getValue()));
            }

            // Блок Доходность
            ArrayList<ContainerValue> personIncomeSegmentList = new ArrayList<>(10);
            // Возможно не правильный мапинг !!! поменять классы в цикле
            for(ContactSegment candidateSegment : candidate.getListOfContactSegment().getContactSegment()) {
                personIncomeSegmentList.add(new ContainerValue(candidateSegment.getValue()));
            }

            // Блок Обслуживание
            ArrayList<ServiceSegment> personServiceSegmentList = new ArrayList<>(10);
            // Возможно не правильный мапинг !!! поменять классы в цикле
            for(ContactSegment candidateSegment : candidate.getListOfContactSegment().getContactSegment()) {
                ServiceSegment personServiceSegment = new ServiceSegment();

                personServiceSegment.setValue(candidateSegment.getValue());
                personServiceSegment.setNameExternalSystem(candidateSegment.getNameExternalSystem());
                personServiceSegment.setStartDate(candidateSegment.getStartDate());
                personServiceSegment.setEndDate(candidateSegment.getEndDate());
                personServiceSegment.setUpdateDate(candidateSegment.getUpdateDate());
                personServiceSegment.setLoginExternalSystem(candidateSegment.getLoginExternalSystem());
                personServiceSegment.setStatus(candidateSegment.getStatus());
                personServiceSegment.setCriterion(candidateSegment.getCriterion());

                personServiceSegmentList.add(personServiceSegment);
            }

            // Блок Состоятельный
            ArrayList<ContainerValue> personWealthySegmentList = new ArrayList<>(10);
            // Возможно не правильный мапинг !!! поменять классы в цикле
            for(ContactSegment candidateSegment : candidate.getListOfContactSegment().getContactSegment()) {
                personWealthySegmentList.add(new ContainerValue(candidateSegment.getValue()));
            }

            // Блок Чёрные списки
            ArrayList<BlackList> personBlackSegmentList = new ArrayList<>(10);
            // Возможно не правильный мапинг !!! поменять классы в цикле
            for(ContactSegment candidateSegment : candidate.getListOfContactSegment().getContactSegment()) {
                if(candidateSegment.getValue().equals("Y")){
                    BlackList personBlackSegment = new BlackList();

                    personBlackSegment.setType(candidateSegment.getType());
                    personBlackSegment.setValue(candidateSegment.getValue());
                    personBlackSegment.setNameExternalSystem(candidateSegment.getNameExternalSystem());
                    personBlackSegment.setStartDate(candidateSegment.getStartDate());
                    personBlackSegment.setEndDate(candidateSegment.getEndDate());
                    personBlackSegment.setUpdateDate(candidateSegment.getUpdateDate());
                    personBlackSegment.setLoginExternalSystem(candidateSegment.getLoginExternalSystem());

                    personBlackSegmentList.add(personBlackSegment);
                }
            }

            // Блок Пенсионный статус
            ArrayList<ContainerValue> personRetirementSegmentList = new ArrayList<>(10);
            // Возможно не правильный мапинг !!! поменять классы в цикле
            for(ContactSegment candidateSegment : candidate.getListOfContactSegment().getContactSegment()) {
                if(candidateSegment.getType().equals("49"))
                    personRetirementSegmentList.add(new ContainerValue(candidateSegment.getValue()));
            }

            // Блок Пенсионный статус
            ArrayList<ContainerValue> personClosedSegmentList = new ArrayList<>(10);
            // Возможно не правильный мапинг !!! поменять классы в цикле
            for(ContactSegment candidateSegment : candidate.getListOfContactSegment().getContactSegment()) {
                if(candidateSegment.getType().equals("56"))
                    personClosedSegmentList.add(new ContainerValue(candidateSegment.getValue()));
            }

///////////////////////////////////////

            person.setClosedSegment(personClosedSegmentList);
            person.setRetirementType(personRetirementSegmentList);
            person.setBlackList(personBlackSegmentList);
            person.setWealthyIndicator(personWealthySegmentList);
            person.setServiceSegment(personServiceSegmentList);
            person.setIncomeSegment(personIncomeSegmentList);
            person.setFormerCustomer(personFormerCustomerList);
            person.setPhoneCommunication(personPhoneList);
            person.setContactIdentity(personContactIdentityList);
            person.setContactReference(personCrosRefList);
            person.setPersonalAddress(personAddresList);
            PersonList.add(person);
        }

        personMatchOutputJSON.setPerson(PersonList);
        return personMatchOutputJSON;
    }


    // Для классов был создан отдельный интерфейс содержаший методы получения необходимых для проверки полей
    private <S extends TypeCheckObject> List<S> clearList(List<S> objList){
        // Составляем таблицу с типами проверенныых сущностей
        // Из-за того, что классы сгенерённые WSDL не правим, нельзя сделать
        List<String> TypeList = new ArrayList<>(10);
        for (S type : objList){
            if(type.getTrustFlag().equals("Y"))
                TypeList.add(type.getType());
        }

        Iterator<S> iterator = objList.iterator();
        while (iterator.hasNext()){
            S current = iterator.next();
            if(current.getTrustFlag().equals("N")){
                if(TypeList.indexOf(current.getType()) > 0){
                    iterator.remove();
                }
            }
        }
        return objList;
    }

    private static SimpleDateFormat mmddyyyy = new SimpleDateFormat("MM/dd/yyyy");
    private static SimpleDateFormat mmddyyyyhmmss = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
    private boolean isUpDate(String date){
        if(date.isEmpty())
            return true;
        Date currentDate = new Date();
        try {
            if(mmddyyyyhmmss.parse(date).after(currentDate))
                return true;
            return false;
        }catch (ParseException e){
            // Возможно стоит логировать если пришла не корректная дата
        }
        try {
            if(mmddyyyy.parse(date).after(currentDate))
                return true;
            return false;
        }catch (ParseException e){
            // Возможно стоит логировать если пришла не корректная дата
        }
        return false;

    }

}
