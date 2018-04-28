//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.04.15 a las 06:28:31 PM CEST 
//


package com.soap.consumer.domain;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the vrmsConnectionServices.wsdl package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetBookingListRQ_QNAME = new QName("ws.avantio.com/crsConnectionServices/xsd", "GetBookingListRQ");
    private final static QName _GetBookingListRS_QNAME = new QName("ws.avantio.com/crsConnectionServices/xsd", "GetBookingListRS");
    private final static QName _GetChangesRQ_QNAME = new QName("ws.avantio.com/crsConnectionServices/xsd", "GetChangesRQ");
    private final static QName _GetChangesRS_QNAME = new QName("ws.avantio.com/crsConnectionServices/xsd", "GetChangesRS");
    private final static QName _GetCompaniesRQ_QNAME = new QName("ws.avantio.com/crsConnectionServices/xsd", "GetCompaniesRQ");
    private final static QName _GetCompaniesRS_QNAME = new QName("ws.avantio.com/crsConnectionServices/xsd", "GetCompaniesRS");
    private final static QName _ModifyBookingRQ_QNAME = new QName("ws.avantio.com/crsConnectionServices/xsd", "ModifyBookingRQ");
    private final static QName _ModifyBookingRS_QNAME = new QName("ws.avantio.com/crsConnectionServices/xsd", "ModifyBookingRS");
    private final static QName _GetOccupationalRulesRQ_QNAME = new QName("ws.avantio.com/crsConnectionServices/xsd", "GetOccupationalRulesRQ");
    private final static QName _GetOccupationalRulesRS_QNAME = new QName("ws.avantio.com/crsConnectionServices/xsd", "GetOccupationalRulesRS");
    private final static QName _GetLogicAreasRQ_QNAME = new QName("ws.avantio.com/crsConnectionServices/xsd", "GetLogicAreasRQ");
    private final static QName _GetLogicAreasRS_QNAME = new QName("ws.avantio.com/crsConnectionServices/xsd", "GetLogicAreasRS");
    private final static QName _GetAccommodationDescriptionsRQ_QNAME = new QName("ws.avantio.com/crsConnectionServices/xsd", "GetAccommodationDescriptionsRQ");
    private final static QName _GetAccommodationDescriptionsRS_QNAME = new QName("ws.avantio.com/crsConnectionServices/xsd", "GetAccommodationDescriptionsRS");
    private final static QName _GetBookingPriceRQ_QNAME = new QName("ws.avantio.com/crsConnectionServices/xsd", "GetBookingPriceRQ");
    private final static QName _GetBookingPriceRS_QNAME = new QName("ws.avantio.com/crsConnectionServices/xsd", "GetBookingPriceRS");
    private final static QName _GetFeaturedAccommodationsRQ_QNAME = new QName("ws.avantio.com/crsConnectionServices/xsd", "GetFeaturedAccommodationsRQ");
    private final static QName _GetFeaturedAccommodationsRS_QNAME = new QName("ws.avantio.com/crsConnectionServices/xsd", "GetFeaturedAccommodationsRS");
    private final static QName _GetAccommodationListRQ_QNAME = new QName("ws.avantio.com/crsConnectionServices/xsd", "GetAccommodationListRQ");
    private final static QName _GetAccommodationListRS_QNAME = new QName("ws.avantio.com/crsConnectionServices/xsd", "GetAccommodationListRS");
    private final static QName _GetRatesListRQ_QNAME = new QName("ws.avantio.com/crsConnectionServices/xsd", "GetRatesListRQ");
    private final static QName _GetRatesListRS_QNAME = new QName("ws.avantio.com/crsConnectionServices/xsd", "GetRatesListRS");
    private final static QName _GetBookingRQ_QNAME = new QName("ws.avantio.com/crsConnectionServices/xsd", "GetBookingRQ");
    private final static QName _GetBookingRS_QNAME = new QName("ws.avantio.com/crsConnectionServices/xsd", "GetBookingRS");
    private final static QName _IsAvailableRQ_QNAME = new QName("ws.avantio.com/crsConnectionServices/xsd", "IsAvailableRQ");
    private final static QName _IsAvailableRS_QNAME = new QName("ws.avantio.com/crsConnectionServices/xsd", "IsAvailableRS");
    private final static QName _GetRatesRQ_QNAME = new QName("ws.avantio.com/crsConnectionServices/xsd", "GetRatesRQ");
    private final static QName _GetRatesRS_QNAME = new QName("ws.avantio.com/crsConnectionServices/xsd", "GetRatesRS");
    private final static QName _GetAllAccommodationListRQ_QNAME = new QName("ws.avantio.com/crsConnectionServices/xsd", "GetAllAccommodationListRQ");
    private final static QName _GetAllAccommodationListRS_QNAME = new QName("ws.avantio.com/crsConnectionServices/xsd", "GetAllAccommodationListRS");
    private final static QName _SetBookingRQ_QNAME = new QName("ws.avantio.com/crsConnectionServices/xsd", "SetBookingRQ");
    private final static QName _SetBookingRS_QNAME = new QName("ws.avantio.com/crsConnectionServices/xsd", "SetBookingRS");
    private final static QName _GetDiscountsSupplementsRQ_QNAME = new QName("ws.avantio.com/crsConnectionServices/xsd", "GetDiscountsSupplementsRQ");
    private final static QName _GetDiscountsSupplementsRS_QNAME = new QName("ws.avantio.com/crsConnectionServices/xsd", "GetDiscountsSupplementsRS");
    private final static QName _GetGeographicAreasRQ_QNAME = new QName("ws.avantio.com/crsConnectionServices/xsd", "GetGeographicAreasRQ");
    private final static QName _GetGeographicAreasRS_QNAME = new QName("ws.avantio.com/crsConnectionServices/xsd", "GetGeographicAreasRS");
    private final static QName _GetAccommodationDataRQ_QNAME = new QName("ws.avantio.com/crsConnectionServices/xsd", "GetAccommodationDataRQ");
    private final static QName _GetAccommodationDataRS_QNAME = new QName("ws.avantio.com/crsConnectionServices/xsd", "GetAccommodationDataRS");
    private final static QName _GetAccommodationStatusRQ_QNAME = new QName("ws.avantio.com/crsConnectionServices/xsd", "GetAccommodationStatusRQ");
    private final static QName _GetAccommodationStatusRS_QNAME = new QName("ws.avantio.com/crsConnectionServices/xsd", "GetAccommodationStatusRS");
    private final static QName _AddCommentRQ_QNAME = new QName("ws.avantio.com/crsConnectionServices/xsd", "AddCommentRQ");
    private final static QName _AddCommentRS_QNAME = new QName("ws.avantio.com/crsConnectionServices/xsd", "AddCommentRS");
    private final static QName _CancelBookingRQ_QNAME = new QName("ws.avantio.com/crsConnectionServices/xsd", "CancelBookingRQ");
    private final static QName _CancelBookingRS_QNAME = new QName("ws.avantio.com/crsConnectionServices/xsd", "CancelBookingRS");
    private final static QName _GetAvailabilitiesRQ_QNAME = new QName("ws.avantio.com/crsConnectionServices/xsd", "GetAvailabilitiesRQ");
    private final static QName _GetAvailabilitiesRS_QNAME = new QName("ws.avantio.com/crsConnectionServices/xsd", "GetAvailabilitiesRS");
    private final static QName _GetAccommodationKindsRQ_QNAME = new QName("ws.avantio.com/crsConnectionServices/xsd", "GetAccommodationKindsRQ");
    private final static QName _GetAccommodationKindsRS_QNAME = new QName("ws.avantio.com/crsConnectionServices/xsd", "GetAccommodationKindsRS");
    private final static QName _GetExternalIDsRQ_QNAME = new QName("ws.avantio.com/crsConnectionServices/xsd", "GetExternalIDsRQ");
    private final static QName _GetExternalIDsRS_QNAME = new QName("ws.avantio.com/crsConnectionServices/xsd", "GetExternalIDsRS");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: vrmsConnectionServices.wsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetBookingListRQ }
     * 
     */
    public GetBookingListRQ createGetBookingListRQ() {
        return new GetBookingListRQ();
    }

    /**
     * Create an instance of {@link GetBookingListRS }
     * 
     */
    public GetBookingListRS createGetBookingListRS() {
        return new GetBookingListRS();
    }

    /**
     * Create an instance of {@link GetChangesRQ }
     * 
     */
    public GetChangesRQ createGetChangesRQ() {
        return new GetChangesRQ();
    }

    /**
     * Create an instance of {@link GetChangesRS }
     * 
     */
    public GetChangesRS createGetChangesRS() {
        return new GetChangesRS();
    }

    /**
     * Create an instance of {@link GetCompaniesRQ }
     * 
     */
    public GetCompaniesRQ createGetCompaniesRQ() {
        return new GetCompaniesRQ();
    }

    /**
     * Create an instance of {@link GetCompaniesRS }
     * 
     */
    public GetCompaniesRS createGetCompaniesRS() {
        return new GetCompaniesRS();
    }

    /**
     * Create an instance of {@link ModifyBookingRQ }
     * 
     */
    public ModifyBookingRQ createModifyBookingRQ() {
        return new ModifyBookingRQ();
    }

    /**
     * Create an instance of {@link ModifyBookingRS }
     * 
     */
    public ModifyBookingRS createModifyBookingRS() {
        return new ModifyBookingRS();
    }

    /**
     * Create an instance of {@link GetOccupationalRulesRQ }
     * 
     */
    public GetOccupationalRulesRQ createGetOccupationalRulesRQ() {
        return new GetOccupationalRulesRQ();
    }

    /**
     * Create an instance of {@link GetOccupationalRulesRS }
     * 
     */
    public GetOccupationalRulesRS createGetOccupationalRulesRS() {
        return new GetOccupationalRulesRS();
    }

    /**
     * Create an instance of {@link GetLogicAreasRQ }
     * 
     */
    public GetLogicAreasRQ createGetLogicAreasRQ() {
        return new GetLogicAreasRQ();
    }

    /**
     * Create an instance of {@link GetLogicAreasRS }
     * 
     */
    public GetLogicAreasRS createGetLogicAreasRS() {
        return new GetLogicAreasRS();
    }

    /**
     * Create an instance of {@link GetAccommodationDescriptionsRQ }
     * 
     */
    public GetAccommodationDescriptionsRQ createGetAccommodationDescriptionsRQ() {
        return new GetAccommodationDescriptionsRQ();
    }

    /**
     * Create an instance of {@link GetAccommodationDescriptionsRS }
     * 
     */
    public GetAccommodationDescriptionsRS createGetAccommodationDescriptionsRS() {
        return new GetAccommodationDescriptionsRS();
    }

    /**
     * Create an instance of {@link GetBookingPriceRQ }
     * 
     */
    public GetBookingPriceRQ createGetBookingPriceRQ() {
        return new GetBookingPriceRQ();
    }

    /**
     * Create an instance of {@link GetBookingPriceRS }
     * 
     */
    public GetBookingPriceRS createGetBookingPriceRS() {
        return new GetBookingPriceRS();
    }

    /**
     * Create an instance of {@link GetFeaturedAccommodationsRQ }
     * 
     */
    public GetFeaturedAccommodationsRQ createGetFeaturedAccommodationsRQ() {
        return new GetFeaturedAccommodationsRQ();
    }

    /**
     * Create an instance of {@link GetFeaturedAccommodationsRS }
     * 
     */
    public GetFeaturedAccommodationsRS createGetFeaturedAccommodationsRS() {
        return new GetFeaturedAccommodationsRS();
    }

    /**
     * Create an instance of {@link GetAccommodationListRQ }
     * 
     */
    public GetAccommodationListRQ createGetAccommodationListRQ() {
        return new GetAccommodationListRQ();
    }

    /**
     * Create an instance of {@link GetAccommodationListRS }
     * 
     */
    public GetAccommodationListRS createGetAccommodationListRS() {
        return new GetAccommodationListRS();
    }

    /**
     * Create an instance of {@link GetRatesListRQ }
     * 
     */
    public GetRatesListRQ createGetRatesListRQ() {
        return new GetRatesListRQ();
    }

    /**
     * Create an instance of {@link GetRatesListRS }
     * 
     */
    public GetRatesListRS createGetRatesListRS() {
        return new GetRatesListRS();
    }

    /**
     * Create an instance of {@link GetBookingRQ }
     * 
     */
    public GetBookingRQ createGetBookingRQ() {
        return new GetBookingRQ();
    }

    /**
     * Create an instance of {@link GetBookingRS }
     * 
     */
    public GetBookingRS createGetBookingRS() {
        return new GetBookingRS();
    }

    /**
     * Create an instance of {@link IsAvailableRQ }
     * 
     */
    public IsAvailableRQ createIsAvailableRQ() {
        return new IsAvailableRQ();
    }

    /**
     * Create an instance of {@link IsAvailableRS }
     * 
     */
    public IsAvailableRS createIsAvailableRS() {
        return new IsAvailableRS();
    }

    /**
     * Create an instance of {@link GetRatesRQ }
     * 
     */
    public GetRatesRQ createGetRatesRQ() {
        return new GetRatesRQ();
    }

    /**
     * Create an instance of {@link GetRatesRS }
     * 
     */
    public GetRatesRS createGetRatesRS() {
        return new GetRatesRS();
    }

    /**
     * Create an instance of {@link GetAllAccommodationListRQ }
     * 
     */
    public GetAllAccommodationListRQ createGetAllAccommodationListRQ() {
        return new GetAllAccommodationListRQ();
    }

    /**
     * Create an instance of {@link GetAllAccommodationListRS }
     * 
     */
    public GetAllAccommodationListRS createGetAllAccommodationListRS() {
        return new GetAllAccommodationListRS();
    }

    /**
     * Create an instance of {@link SetBookingRQ }
     * 
     */
    public SetBookingRQ createSetBookingRQ() {
        return new SetBookingRQ();
    }

    /**
     * Create an instance of {@link SetBookingRS }
     * 
     */
    public SetBookingRS createSetBookingRS() {
        return new SetBookingRS();
    }

    /**
     * Create an instance of {@link GetDiscountsSupplementsRQ }
     * 
     */
    public GetDiscountsSupplementsRQ createGetDiscountsSupplementsRQ() {
        return new GetDiscountsSupplementsRQ();
    }

    /**
     * Create an instance of {@link GetDiscountsSupplementsRS }
     * 
     */
    public GetDiscountsSupplementsRS createGetDiscountsSupplementsRS() {
        return new GetDiscountsSupplementsRS();
    }

    /**
     * Create an instance of {@link GetGeographicAreasRQ }
     * 
     */
    public GetGeographicAreasRQ createGetGeographicAreasRQ() {
        return new GetGeographicAreasRQ();
    }

    /**
     * Create an instance of {@link GetGeographicAreasRS }
     * 
     */
    public GetGeographicAreasRS createGetGeographicAreasRS() {
        return new GetGeographicAreasRS();
    }

    /**
     * Create an instance of {@link GetAccommodationDataRQ }
     * 
     */
    public GetAccommodationDataRQ createGetAccommodationDataRQ() {
        return new GetAccommodationDataRQ();
    }

    /**
     * Create an instance of {@link GetAccommodationDataRS }
     * 
     */
    public GetAccommodationDataRS createGetAccommodationDataRS() {
        return new GetAccommodationDataRS();
    }

    /**
     * Create an instance of {@link GetAccommodationStatusRQ }
     * 
     */
    public GetAccommodationStatusRQ createGetAccommodationStatusRQ() {
        return new GetAccommodationStatusRQ();
    }

    /**
     * Create an instance of {@link GetAccommodationStatusRS }
     * 
     */
    public GetAccommodationStatusRS createGetAccommodationStatusRS() {
        return new GetAccommodationStatusRS();
    }

    /**
     * Create an instance of {@link AddCommentRQ }
     * 
     */
    public AddCommentRQ createAddCommentRQ() {
        return new AddCommentRQ();
    }

    /**
     * Create an instance of {@link BooleanResponse }
     * 
     */
    public BooleanResponse createBooleanResponse() {
        return new BooleanResponse();
    }

    /**
     * Create an instance of {@link CancelBookingRQ }
     * 
     */
    public CancelBookingRQ createCancelBookingRQ() {
        return new CancelBookingRQ();
    }

    /**
     * Create an instance of {@link CancelBookingRS }
     * 
     */
    public CancelBookingRS createCancelBookingRS() {
        return new CancelBookingRS();
    }

    /**
     * Create an instance of {@link GetAvailabilitiesRQ }
     * 
     */
    public GetAvailabilitiesRQ createGetAvailabilitiesRQ() {
        return new GetAvailabilitiesRQ();
    }

    /**
     * Create an instance of {@link GetAvailabilitiesRS }
     * 
     */
    public GetAvailabilitiesRS createGetAvailabilitiesRS() {
        return new GetAvailabilitiesRS();
    }

    /**
     * Create an instance of {@link GetAccommodationKindsRQ }
     * 
     */
    public GetAccommodationKindsRQ createGetAccommodationKindsRQ() {
        return new GetAccommodationKindsRQ();
    }

    /**
     * Create an instance of {@link GetAccommodationKindsRS }
     * 
     */
    public GetAccommodationKindsRS createGetAccommodationKindsRS() {
        return new GetAccommodationKindsRS();
    }

    /**
     * Create an instance of {@link GetExternalIDsRQ }
     * 
     */
    public GetExternalIDsRQ createGetExternalIDsRQ() {
        return new GetExternalIDsRQ();
    }

    /**
     * Create an instance of {@link GetExternalIDsRS }
     * 
     */
    public GetExternalIDsRS createGetExternalIDsRS() {
        return new GetExternalIDsRS();
    }

    /**
     * Create an instance of {@link CredentialsNoLanguage }
     * 
     */
    public CredentialsNoLanguage createCredentialsNoLanguage() {
        return new CredentialsNoLanguage();
    }

    /**
     * Create an instance of {@link BookingListCriteria }
     * 
     */
    public BookingListCriteria createBookingListCriteria() {
        return new BookingListCriteria();
    }

    /**
     * Create an instance of {@link BookingDataResponse }
     * 
     */
    public BookingDataResponse createBookingDataResponse() {
        return new BookingDataResponse();
    }

    /**
     * Create an instance of {@link Localizer }
     * 
     */
    public Localizer createLocalizer() {
        return new Localizer();
    }

    /**
     * Create an instance of {@link PriceDetails }
     * 
     */
    public PriceDetails createPriceDetails() {
        return new PriceDetails();
    }

    /**
     * Create an instance of {@link Services }
     * 
     */
    public Services createServices() {
        return new Services();
    }

    /**
     * Create an instance of {@link Service }
     * 
     */
    public Service createService() {
        return new Service();
    }

    /**
     * Create an instance of {@link Accommodation }
     * 
     */
    public Accommodation createAccommodation() {
        return new Accommodation();
    }

    /**
     * Create an instance of {@link Occupants }
     * 
     */
    public Occupants createOccupants() {
        return new Occupants();
    }

    /**
     * Create an instance of {@link ClientData }
     * 
     */
    public ClientData createClientData() {
        return new ClientData();
    }

    /**
     * Create an instance of {@link Credentials }
     * 
     */
    public Credentials createCredentials() {
        return new Credentials();
    }

    /**
     * Create an instance of {@link ChangesCriteria }
     * 
     */
    public ChangesCriteria createChangesCriteria() {
        return new ChangesCriteria();
    }

    /**
     * Create an instance of {@link ChangesList }
     * 
     */
    public ChangesList createChangesList() {
        return new ChangesList();
    }

    /**
     * Create an instance of {@link SuccessChanges }
     * 
     */
    public SuccessChanges createSuccessChanges() {
        return new SuccessChanges();
    }

    /**
     * Create an instance of {@link FailedChanges }
     * 
     */
    public FailedChanges createFailedChanges() {
        return new FailedChanges();
    }

    /**
     * Create an instance of {@link FailedChange }
     * 
     */
    public FailedChange createFailedChange() {
        return new FailedChange();
    }

    /**
     * Create an instance of {@link ExternalAccommodationList }
     * 
     */
    public ExternalAccommodationList createExternalAccommodationList() {
        return new ExternalAccommodationList();
    }

    /**
     * Create an instance of {@link ExternalAccommodation }
     * 
     */
    public ExternalAccommodation createExternalAccommodation() {
        return new ExternalAccommodation();
    }

    /**
     * Create an instance of {@link ExternalCredentials }
     * 
     */
    public ExternalCredentials createExternalCredentials() {
        return new ExternalCredentials();
    }

    /**
     * Create an instance of {@link Changes }
     * 
     */
    public Changes createChanges() {
        return new Changes();
    }

    /**
     * Create an instance of {@link Change }
     * 
     */
    public Change createChange() {
        return new Change();
    }

    /**
     * Create an instance of {@link BookingData }
     * 
     */
    public BookingData createBookingData() {
        return new BookingData();
    }

    /**
     * Create an instance of {@link CreditCardData }
     * 
     */
    public CreditCardData createCreditCardData() {
        return new CreditCardData();
    }

    /**
     * Create an instance of {@link ErrorList }
     * 
     */
    public ErrorList createErrorList() {
        return new ErrorList();
    }

    /**
     * Create an instance of {@link Error }
     * 
     */
    public Error createError() {
        return new Error();
    }

    /**
     * Create an instance of {@link AccommodationDatesCriteria }
     * 
     */
    public AccommodationDatesCriteria createAccommodationDatesCriteria() {
        return new AccommodationDatesCriteria();
    }

    /**
     * Create an instance of {@link OccupationalRule }
     * 
     */
    public OccupationalRule createOccupationalRule() {
        return new OccupationalRule();
    }

    /**
     * Create an instance of {@link OccupationalRuleDays }
     * 
     */
    public OccupationalRuleDays createOccupationalRuleDays() {
        return new OccupationalRuleDays();
    }

    /**
     * Create an instance of {@link LogicAreasCriteria }
     * 
     */
    public LogicAreasCriteria createLogicAreasCriteria() {
        return new LogicAreasCriteria();
    }

    /**
     * Create an instance of {@link CountryLogicList }
     * 
     */
    public CountryLogicList createCountryLogicList() {
        return new CountryLogicList();
    }

    /**
     * Create an instance of {@link CountryLogic }
     * 
     */
    public CountryLogic createCountryLogic() {
        return new CountryLogic();
    }

    /**
     * Create an instance of {@link AreaLogicList }
     * 
     */
    public AreaLogicList createAreaLogicList() {
        return new AreaLogicList();
    }

    /**
     * Create an instance of {@link AreaLogicDist }
     * 
     */
    public AreaLogicDist createAreaLogicDist() {
        return new AreaLogicDist();
    }

    /**
     * Create an instance of {@link LocalityList }
     * 
     */
    public LocalityList createLocalityList() {
        return new LocalityList();
    }

    /**
     * Create an instance of {@link Locality }
     * 
     */
    public Locality createLocality() {
        return new Locality();
    }

    /**
     * Create an instance of {@link DistrictList }
     * 
     */
    public DistrictList createDistrictList() {
        return new DistrictList();
    }

    /**
     * Create an instance of {@link District }
     * 
     */
    public District createDistrict() {
        return new District();
    }

    /**
     * Create an instance of {@link AccommodationCriteria }
     * 
     */
    public AccommodationCriteria createAccommodationCriteria() {
        return new AccommodationCriteria();
    }

    /**
     * Create an instance of {@link Images }
     * 
     */
    public Images createImages() {
        return new Images();
    }

    /**
     * Create an instance of {@link Image }
     * 
     */
    public Image createImage() {
        return new Image();
    }

    /**
     * Create an instance of {@link ImageDescriptions }
     * 
     */
    public ImageDescriptions createImageDescriptions() {
        return new ImageDescriptions();
    }

    /**
     * Create an instance of {@link Description }
     * 
     */
    public Description createDescription() {
        return new Description();
    }

    /**
     * Create an instance of {@link InternationalizedAccommodation }
     * 
     */
    public InternationalizedAccommodation createInternationalizedAccommodation() {
        return new InternationalizedAccommodation();
    }

    /**
     * Create an instance of {@link MasterKind }
     * 
     */
    public MasterKind createMasterKind() {
        return new MasterKind();
    }

    /**
     * Create an instance of {@link SimpleCountry }
     * 
     */
    public SimpleCountry createSimpleCountry() {
        return new SimpleCountry();
    }

    /**
     * Create an instance of {@link SimpleRegion }
     * 
     */
    public SimpleRegion createSimpleRegion() {
        return new SimpleRegion();
    }

    /**
     * Create an instance of {@link AreaDist }
     * 
     */
    public AreaDist createAreaDist() {
        return new AreaDist();
    }

    /**
     * Create an instance of {@link SimpleCity }
     * 
     */
    public SimpleCity createSimpleCity() {
        return new SimpleCity();
    }

    /**
     * Create an instance of {@link SimpleLocality }
     * 
     */
    public SimpleLocality createSimpleLocality() {
        return new SimpleLocality();
    }

    /**
     * Create an instance of {@link ExtrasSummary }
     * 
     */
    public ExtrasSummary createExtrasSummary() {
        return new ExtrasSummary();
    }

    /**
     * Create an instance of {@link ExtrasSummaryList }
     * 
     */
    public ExtrasSummaryList createExtrasSummaryList() {
        return new ExtrasSummaryList();
    }

    /**
     * Create an instance of {@link ExtrasSummaryItem }
     * 
     */
    public ExtrasSummaryItem createExtrasSummaryItem() {
        return new ExtrasSummaryItem();
    }

    /**
     * Create an instance of {@link AccommodationOccupantsDatesCriteria }
     * 
     */
    public AccommodationOccupantsDatesCriteria createAccommodationOccupantsDatesCriteria() {
        return new AccommodationOccupantsDatesCriteria();
    }

    /**
     * Create an instance of {@link BookingPrice }
     * 
     */
    public BookingPrice createBookingPrice() {
        return new BookingPrice();
    }

    /**
     * Create an instance of {@link PaymentDetails }
     * 
     */
    public PaymentDetails createPaymentDetails() {
        return new PaymentDetails();
    }

    /**
     * Create an instance of {@link PaymentDetail }
     * 
     */
    public PaymentDetail createPaymentDetail() {
        return new PaymentDetail();
    }

    /**
     * Create an instance of {@link PaymentMethods }
     * 
     */
    public PaymentMethods createPaymentMethods() {
        return new PaymentMethods();
    }

    /**
     * Create an instance of {@link CancellationPolicies }
     * 
     */
    public CancellationPolicies createCancellationPolicies() {
        return new CancellationPolicies();
    }

    /**
     * Create an instance of {@link CancellationPolicyList }
     * 
     */
    public CancellationPolicyList createCancellationPolicyList() {
        return new CancellationPolicyList();
    }

    /**
     * Create an instance of {@link CancellationPolicyItem }
     * 
     */
    public CancellationPolicyItem createCancellationPolicyItem() {
        return new CancellationPolicyItem();
    }

    /**
     * Create an instance of {@link NoShow }
     * 
     */
    public NoShow createNoShow() {
        return new NoShow();
    }

    /**
     * Create an instance of {@link FeaturedAccommodationsCriteria }
     * 
     */
    public FeaturedAccommodationsCriteria createFeaturedAccommodationsCriteria() {
        return new FeaturedAccommodationsCriteria();
    }

    /**
     * Create an instance of {@link FeaturedAccommodation }
     * 
     */
    public FeaturedAccommodation createFeaturedAccommodation() {
        return new FeaturedAccommodation();
    }

    /**
     * Create an instance of {@link ComplexFeature }
     * 
     */
    public ComplexFeature createComplexFeature() {
        return new ComplexFeature();
    }

    /**
     * Create an instance of {@link CriteriaAccommodationList }
     * 
     */
    public CriteriaAccommodationList createCriteriaAccommodationList() {
        return new CriteriaAccommodationList();
    }

    /**
     * Create an instance of {@link Proximity }
     * 
     */
    public Proximity createProximity() {
        return new Proximity();
    }

    /**
     * Create an instance of {@link OrderCriteria }
     * 
     */
    public OrderCriteria createOrderCriteria() {
        return new OrderCriteria();
    }

    /**
     * Create an instance of {@link AccommodationList }
     * 
     */
    public AccommodationList createAccommodationList() {
        return new AccommodationList();
    }

    /**
     * Create an instance of {@link ItemAccommodationList }
     * 
     */
    public ItemAccommodationList createItemAccommodationList() {
        return new ItemAccommodationList();
    }

    /**
     * Create an instance of {@link AdultsAndChildsCapacity }
     * 
     */
    public AdultsAndChildsCapacity createAdultsAndChildsCapacity() {
        return new AdultsAndChildsCapacity();
    }

    /**
     * Create an instance of {@link FeaturesList }
     * 
     */
    public FeaturesList createFeaturesList() {
        return new FeaturesList();
    }

    /**
     * Create an instance of {@link FeaturesHotel }
     * 
     */
    public FeaturesHotel createFeaturesHotel() {
        return new FeaturesHotel();
    }

    /**
     * Create an instance of {@link Views }
     * 
     */
    public Views createViews() {
        return new Views();
    }

    /**
     * Create an instance of {@link Distances }
     * 
     */
    public Distances createDistances() {
        return new Distances();
    }

    /**
     * Create an instance of {@link Price }
     * 
     */
    public Price createPrice() {
        return new Price();
    }

    /**
     * Create an instance of {@link CriteriaAccommodation }
     * 
     */
    public CriteriaAccommodation createCriteriaAccommodation() {
        return new CriteriaAccommodation();
    }

    /**
     * Create an instance of {@link AccommodationRatesList }
     * 
     */
    public AccommodationRatesList createAccommodationRatesList() {
        return new AccommodationRatesList();
    }

    /**
     * Create an instance of {@link AccommodationRates }
     * 
     */
    public AccommodationRates createAccommodationRates() {
        return new AccommodationRates();
    }

    /**
     * Create an instance of {@link RatesList }
     * 
     */
    public RatesList createRatesList() {
        return new RatesList();
    }

    /**
     * Create an instance of {@link RatePeriod }
     * 
     */
    public RatePeriod createRatePeriod() {
        return new RatePeriod();
    }

    /**
     * Create an instance of {@link PriceByType }
     * 
     */
    public PriceByType createPriceByType() {
        return new PriceByType();
    }

    /**
     * Create an instance of {@link Discounts }
     * 
     */
    public Discounts createDiscounts() {
        return new Discounts();
    }

    /**
     * Create an instance of {@link Discount }
     * 
     */
    public Discount createDiscount() {
        return new Discount();
    }

    /**
     * Create an instance of {@link Supplements }
     * 
     */
    public Supplements createSupplements() {
        return new Supplements();
    }

    /**
     * Create an instance of {@link SingleSupplement }
     * 
     */
    public SingleSupplement createSingleSupplement() {
        return new SingleSupplement();
    }

    /**
     * Create an instance of {@link SupplementByAdditionalPerson }
     * 
     */
    public SupplementByAdditionalPerson createSupplementByAdditionalPerson() {
        return new SupplementByAdditionalPerson();
    }

    /**
     * Create an instance of {@link VAT }
     * 
     */
    public VAT createVAT() {
        return new VAT();
    }

    /**
     * Create an instance of {@link AvailableCriteria }
     * 
     */
    public AvailableCriteria createAvailableCriteria() {
        return new AvailableCriteria();
    }

    /**
     * Create an instance of {@link Available }
     * 
     */
    public Available createAvailable() {
        return new Available();
    }

    /**
     * Create an instance of {@link AllAccommodationList }
     * 
     */
    public AllAccommodationList createAllAccommodationList() {
        return new AllAccommodationList();
    }

    /**
     * Create an instance of {@link ItemAllAccommodationList }
     * 
     */
    public ItemAllAccommodationList createItemAllAccommodationList() {
        return new ItemAllAccommodationList();
    }

    /**
     * Create an instance of {@link WarningList }
     * 
     */
    public WarningList createWarningList() {
        return new WarningList();
    }

    /**
     * Create an instance of {@link Warning }
     * 
     */
    public Warning createWarning() {
        return new Warning();
    }

    /**
     * Create an instance of {@link PriceModifier }
     * 
     */
    public PriceModifier createPriceModifier() {
        return new PriceModifier();
    }

    /**
     * Create an instance of {@link GeographicAreasCriteria }
     * 
     */
    public GeographicAreasCriteria createGeographicAreasCriteria() {
        return new GeographicAreasCriteria();
    }

    /**
     * Create an instance of {@link CountryList }
     * 
     */
    public CountryList createCountryList() {
        return new CountryList();
    }

    /**
     * Create an instance of {@link Country }
     * 
     */
    public Country createCountry() {
        return new Country();
    }

    /**
     * Create an instance of {@link RegionList }
     * 
     */
    public RegionList createRegionList() {
        return new RegionList();
    }

    /**
     * Create an instance of {@link Region }
     * 
     */
    public Region createRegion() {
        return new Region();
    }

    /**
     * Create an instance of {@link CityList }
     * 
     */
    public CityList createCityList() {
        return new CityList();
    }

    /**
     * Create an instance of {@link City }
     * 
     */
    public City createCity() {
        return new City();
    }

    /**
     * Create an instance of {@link CriteriaAccommodationData }
     * 
     */
    public CriteriaAccommodationData createCriteriaAccommodationData() {
        return new CriteriaAccommodationData();
    }

    /**
     * Create an instance of {@link AccommodationData }
     * 
     */
    public AccommodationData createAccommodationData() {
        return new AccommodationData();
    }

    /**
     * Create an instance of {@link HotelFeatures }
     * 
     */
    public HotelFeatures createHotelFeatures() {
        return new HotelFeatures();
    }

    /**
     * Create an instance of {@link LocalizationData }
     * 
     */
    public LocalizationData createLocalizationData() {
        return new LocalizationData();
    }

    /**
     * Create an instance of {@link Resort }
     * 
     */
    public Resort createResort() {
        return new Resort();
    }

    /**
     * Create an instance of {@link GoogleMaps }
     * 
     */
    public GoogleMaps createGoogleMaps() {
        return new GoogleMaps();
    }

    /**
     * Create an instance of {@link Features }
     * 
     */
    public Features createFeatures() {
        return new Features();
    }

    /**
     * Create an instance of {@link Distribution }
     * 
     */
    public Distribution createDistribution() {
        return new Distribution();
    }

    /**
     * Create an instance of {@link Area }
     * 
     */
    public Area createArea() {
        return new Area();
    }

    /**
     * Create an instance of {@link HouseCharacteristics }
     * 
     */
    public HouseCharacteristics createHouseCharacteristics() {
        return new HouseCharacteristics();
    }

    /**
     * Create an instance of {@link SwimmingPool }
     * 
     */
    public SwimmingPool createSwimmingPool() {
        return new SwimmingPool();
    }

    /**
     * Create an instance of {@link Distance }
     * 
     */
    public Distance createDistance() {
        return new Distance();
    }

    /**
     * Create an instance of {@link GeneralDate }
     * 
     */
    public GeneralDate createGeneralDate() {
        return new GeneralDate();
    }

    /**
     * Create an instance of {@link TVSatellite }
     * 
     */
    public TVSatellite createTVSatellite() {
        return new TVSatellite();
    }

    /**
     * Create an instance of {@link Kitchen }
     * 
     */
    public Kitchen createKitchen() {
        return new Kitchen();
    }

    /**
     * Create an instance of {@link Extras }
     * 
     */
    public Extras createExtras() {
        return new Extras();
    }

    /**
     * Create an instance of {@link Heating }
     * 
     */
    public Heating createHeating() {
        return new Heating();
    }

    /**
     * Create an instance of {@link Season }
     * 
     */
    public Season createSeason() {
        return new Season();
    }

    /**
     * Create an instance of {@link AirConditioned }
     * 
     */
    public AirConditioned createAirConditioned() {
        return new AirConditioned();
    }

    /**
     * Create an instance of {@link Parking }
     * 
     */
    public Parking createParking() {
        return new Parking();
    }

    /**
     * Create an instance of {@link ExtraBeds }
     * 
     */
    public ExtraBeds createExtraBeds() {
        return new ExtraBeds();
    }

    /**
     * Create an instance of {@link HeatedSwimmingPool }
     * 
     */
    public HeatedSwimmingPool createHeatedSwimmingPool() {
        return new HeatedSwimmingPool();
    }

    /**
     * Create an instance of {@link BedClothes }
     * 
     */
    public BedClothes createBedClothes() {
        return new BedClothes();
    }

    /**
     * Create an instance of {@link Towels }
     * 
     */
    public Towels createTowels() {
        return new Towels();
    }

    /**
     * Create an instance of {@link InternetAccess }
     * 
     */
    public InternetAccess createInternetAccess() {
        return new InternetAccess();
    }

    /**
     * Create an instance of {@link PetsAllowed }
     * 
     */
    public PetsAllowed createPetsAllowed() {
        return new PetsAllowed();
    }

    /**
     * Create an instance of {@link FinalClean }
     * 
     */
    public FinalClean createFinalClean() {
        return new FinalClean();
    }

    /**
     * Create an instance of {@link Deposit }
     * 
     */
    public Deposit createDeposit() {
        return new Deposit();
    }

    /**
     * Create an instance of {@link InternetAccessInRoom }
     * 
     */
    public InternetAccessInRoom createInternetAccessInRoom() {
        return new InternetAccessInRoom();
    }

    /**
     * Create an instance of {@link Cot }
     * 
     */
    public Cot createCot() {
        return new Cot();
    }

    /**
     * Create an instance of {@link ExtrasAndServices }
     * 
     */
    public ExtrasAndServices createExtrasAndServices() {
        return new ExtrasAndServices();
    }

    /**
     * Create an instance of {@link SpecialServices }
     * 
     */
    public SpecialServices createSpecialServices() {
        return new SpecialServices();
    }

    /**
     * Create an instance of {@link SpecialService }
     * 
     */
    public SpecialService createSpecialService() {
        return new SpecialService();
    }

    /**
     * Create an instance of {@link CommonServices }
     * 
     */
    public CommonServices createCommonServices() {
        return new CommonServices();
    }

    /**
     * Create an instance of {@link Extra }
     * 
     */
    public Extra createExtra() {
        return new Extra();
    }

    /**
     * Create an instance of {@link Location }
     * 
     */
    public Location createLocation() {
        return new Location();
    }

    /**
     * Create an instance of {@link LocationDescription }
     * 
     */
    public LocationDescription createLocationDescription() {
        return new LocationDescription();
    }

    /**
     * Create an instance of {@link LocationDistances }
     * 
     */
    public LocationDistances createLocationDistances() {
        return new LocationDistances();
    }

    /**
     * Create an instance of {@link DistanceTo }
     * 
     */
    public DistanceTo createDistanceTo() {
        return new DistanceTo();
    }

    /**
     * Create an instance of {@link NearestPlaces }
     * 
     */
    public NearestPlaces createNearestPlaces() {
        return new NearestPlaces();
    }

    /**
     * Create an instance of {@link NearestPlace }
     * 
     */
    public NearestPlace createNearestPlace() {
        return new NearestPlace();
    }

    /**
     * Create an instance of {@link LocationViews }
     * 
     */
    public LocationViews createLocationViews() {
        return new LocationViews();
    }

    /**
     * Create an instance of {@link CheckInCheckOutInfo }
     * 
     */
    public CheckInCheckOutInfo createCheckInCheckOutInfo() {
        return new CheckInCheckOutInfo();
    }

    /**
     * Create an instance of {@link CheckInRules }
     * 
     */
    public CheckInRules createCheckInRules() {
        return new CheckInRules();
    }

    /**
     * Create an instance of {@link CheckInRule }
     * 
     */
    public CheckInRule createCheckInRule() {
        return new CheckInRule();
    }

    /**
     * Create an instance of {@link Schedule }
     * 
     */
    public Schedule createSchedule() {
        return new Schedule();
    }

    /**
     * Create an instance of {@link DaysOfApplication }
     * 
     */
    public DaysOfApplication createDaysOfApplication() {
        return new DaysOfApplication();
    }

    /**
     * Create an instance of {@link DescriptionMultiLanguage }
     * 
     */
    public DescriptionMultiLanguage createDescriptionMultiLanguage() {
        return new DescriptionMultiLanguage();
    }

    /**
     * Create an instance of {@link TitleMultiLanguage }
     * 
     */
    public TitleMultiLanguage createTitleMultiLanguage() {
        return new TitleMultiLanguage();
    }

    /**
     * Create an instance of {@link Reviews }
     * 
     */
    public Reviews createReviews() {
        return new Reviews();
    }

    /**
     * Create an instance of {@link Review }
     * 
     */
    public Review createReview() {
        return new Review();
    }

    /**
     * Create an instance of {@link RatingAspects }
     * 
     */
    public RatingAspects createRatingAspects() {
        return new RatingAspects();
    }

    /**
     * Create an instance of {@link RatingAspect }
     * 
     */
    public RatingAspect createRatingAspect() {
        return new RatingAspect();
    }

    /**
     * Create an instance of {@link Labels }
     * 
     */
    public Labels createLabels() {
        return new Labels();
    }

    /**
     * Create an instance of {@link OnlineStateCriteria }
     * 
     */
    public OnlineStateCriteria createOnlineStateCriteria() {
        return new OnlineStateCriteria();
    }

    /**
     * Create an instance of {@link AccommodationCodeList }
     * 
     */
    public AccommodationCodeList createAccommodationCodeList() {
        return new AccommodationCodeList();
    }

    /**
     * Create an instance of {@link AccommodationStateList }
     * 
     */
    public AccommodationStateList createAccommodationStateList() {
        return new AccommodationStateList();
    }

    /**
     * Create an instance of {@link AccommodationState }
     * 
     */
    public AccommodationState createAccommodationState() {
        return new AccommodationState();
    }

    /**
     * Create an instance of {@link CriteriaAccommodationPages }
     * 
     */
    public CriteriaAccommodationPages createCriteriaAccommodationPages() {
        return new CriteriaAccommodationPages();
    }

    /**
     * Create an instance of {@link Pager }
     * 
     */
    public Pager createPager() {
        return new Pager();
    }

    /**
     * Create an instance of {@link AccommodationAvailList }
     * 
     */
    public AccommodationAvailList createAccommodationAvailList() {
        return new AccommodationAvailList();
    }

    /**
     * Create an instance of {@link AccommodationAvail }
     * 
     */
    public AccommodationAvail createAccommodationAvail() {
        return new AccommodationAvail();
    }

    /**
     * Create an instance of {@link Availabilities }
     * 
     */
    public Availabilities createAvailabilities() {
        return new Availabilities();
    }

    /**
     * Create an instance of {@link AvailabilityPeriod }
     * 
     */
    public AvailabilityPeriod createAvailabilityPeriod() {
        return new AvailabilityPeriod();
    }

    /**
     * Create an instance of {@link Criteria }
     * 
     */
    public Criteria createCriteria() {
        return new Criteria();
    }

    /**
     * Create an instance of {@link InternationalizedKinds }
     * 
     */
    public InternationalizedKinds createInternationalizedKinds() {
        return new InternationalizedKinds();
    }

    /**
     * Create an instance of {@link ExternalIDsCriteria }
     * 
     */
    public ExternalIDsCriteria createExternalIDsCriteria() {
        return new ExternalIDsCriteria();
    }

    /**
     * Create an instance of {@link LocalizerList }
     * 
     */
    public LocalizerList createLocalizerList() {
        return new LocalizerList();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBookingListRQ }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ws.avantio.com/crsConnectionServices/xsd", name = "GetBookingListRQ")
    public JAXBElement<GetBookingListRQ> createGetBookingListRQ(GetBookingListRQ value) {
        return new JAXBElement<GetBookingListRQ>(_GetBookingListRQ_QNAME, GetBookingListRQ.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBookingListRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ws.avantio.com/crsConnectionServices/xsd", name = "GetBookingListRS")
    public JAXBElement<GetBookingListRS> createGetBookingListRS(GetBookingListRS value) {
        return new JAXBElement<GetBookingListRS>(_GetBookingListRS_QNAME, GetBookingListRS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetChangesRQ }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ws.avantio.com/crsConnectionServices/xsd", name = "GetChangesRQ")
    public JAXBElement<GetChangesRQ> createGetChangesRQ(GetChangesRQ value) {
        return new JAXBElement<GetChangesRQ>(_GetChangesRQ_QNAME, GetChangesRQ.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetChangesRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ws.avantio.com/crsConnectionServices/xsd", name = "GetChangesRS")
    public JAXBElement<GetChangesRS> createGetChangesRS(GetChangesRS value) {
        return new JAXBElement<GetChangesRS>(_GetChangesRS_QNAME, GetChangesRS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompaniesRQ }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ws.avantio.com/crsConnectionServices/xsd", name = "GetCompaniesRQ")
    public JAXBElement<GetCompaniesRQ> createGetCompaniesRQ(GetCompaniesRQ value) {
        return new JAXBElement<GetCompaniesRQ>(_GetCompaniesRQ_QNAME, GetCompaniesRQ.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompaniesRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ws.avantio.com/crsConnectionServices/xsd", name = "GetCompaniesRS")
    public JAXBElement<GetCompaniesRS> createGetCompaniesRS(GetCompaniesRS value) {
        return new JAXBElement<GetCompaniesRS>(_GetCompaniesRS_QNAME, GetCompaniesRS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyBookingRQ }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ws.avantio.com/crsConnectionServices/xsd", name = "ModifyBookingRQ")
    public JAXBElement<ModifyBookingRQ> createModifyBookingRQ(ModifyBookingRQ value) {
        return new JAXBElement<ModifyBookingRQ>(_ModifyBookingRQ_QNAME, ModifyBookingRQ.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyBookingRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ws.avantio.com/crsConnectionServices/xsd", name = "ModifyBookingRS")
    public JAXBElement<ModifyBookingRS> createModifyBookingRS(ModifyBookingRS value) {
        return new JAXBElement<ModifyBookingRS>(_ModifyBookingRS_QNAME, ModifyBookingRS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOccupationalRulesRQ }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ws.avantio.com/crsConnectionServices/xsd", name = "GetOccupationalRulesRQ")
    public JAXBElement<GetOccupationalRulesRQ> createGetOccupationalRulesRQ(GetOccupationalRulesRQ value) {
        return new JAXBElement<GetOccupationalRulesRQ>(_GetOccupationalRulesRQ_QNAME, GetOccupationalRulesRQ.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOccupationalRulesRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ws.avantio.com/crsConnectionServices/xsd", name = "GetOccupationalRulesRS")
    public JAXBElement<GetOccupationalRulesRS> createGetOccupationalRulesRS(GetOccupationalRulesRS value) {
        return new JAXBElement<GetOccupationalRulesRS>(_GetOccupationalRulesRS_QNAME, GetOccupationalRulesRS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLogicAreasRQ }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ws.avantio.com/crsConnectionServices/xsd", name = "GetLogicAreasRQ")
    public JAXBElement<GetLogicAreasRQ> createGetLogicAreasRQ(GetLogicAreasRQ value) {
        return new JAXBElement<GetLogicAreasRQ>(_GetLogicAreasRQ_QNAME, GetLogicAreasRQ.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLogicAreasRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ws.avantio.com/crsConnectionServices/xsd", name = "GetLogicAreasRS")
    public JAXBElement<GetLogicAreasRS> createGetLogicAreasRS(GetLogicAreasRS value) {
        return new JAXBElement<GetLogicAreasRS>(_GetLogicAreasRS_QNAME, GetLogicAreasRS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccommodationDescriptionsRQ }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ws.avantio.com/crsConnectionServices/xsd", name = "GetAccommodationDescriptionsRQ")
    public JAXBElement<GetAccommodationDescriptionsRQ> createGetAccommodationDescriptionsRQ(GetAccommodationDescriptionsRQ value) {
        return new JAXBElement<GetAccommodationDescriptionsRQ>(_GetAccommodationDescriptionsRQ_QNAME, GetAccommodationDescriptionsRQ.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccommodationDescriptionsRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ws.avantio.com/crsConnectionServices/xsd", name = "GetAccommodationDescriptionsRS")
    public JAXBElement<GetAccommodationDescriptionsRS> createGetAccommodationDescriptionsRS(GetAccommodationDescriptionsRS value) {
        return new JAXBElement<GetAccommodationDescriptionsRS>(_GetAccommodationDescriptionsRS_QNAME, GetAccommodationDescriptionsRS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBookingPriceRQ }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ws.avantio.com/crsConnectionServices/xsd", name = "GetBookingPriceRQ")
    public JAXBElement<GetBookingPriceRQ> createGetBookingPriceRQ(GetBookingPriceRQ value) {
        return new JAXBElement<GetBookingPriceRQ>(_GetBookingPriceRQ_QNAME, GetBookingPriceRQ.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBookingPriceRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ws.avantio.com/crsConnectionServices/xsd", name = "GetBookingPriceRS")
    public JAXBElement<GetBookingPriceRS> createGetBookingPriceRS(GetBookingPriceRS value) {
        return new JAXBElement<GetBookingPriceRS>(_GetBookingPriceRS_QNAME, GetBookingPriceRS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFeaturedAccommodationsRQ }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ws.avantio.com/crsConnectionServices/xsd", name = "GetFeaturedAccommodationsRQ")
    public JAXBElement<GetFeaturedAccommodationsRQ> createGetFeaturedAccommodationsRQ(GetFeaturedAccommodationsRQ value) {
        return new JAXBElement<GetFeaturedAccommodationsRQ>(_GetFeaturedAccommodationsRQ_QNAME, GetFeaturedAccommodationsRQ.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFeaturedAccommodationsRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ws.avantio.com/crsConnectionServices/xsd", name = "GetFeaturedAccommodationsRS")
    public JAXBElement<GetFeaturedAccommodationsRS> createGetFeaturedAccommodationsRS(GetFeaturedAccommodationsRS value) {
        return new JAXBElement<GetFeaturedAccommodationsRS>(_GetFeaturedAccommodationsRS_QNAME, GetFeaturedAccommodationsRS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccommodationListRQ }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ws.avantio.com/crsConnectionServices/xsd", name = "GetAccommodationListRQ")
    public JAXBElement<GetAccommodationListRQ> createGetAccommodationListRQ(GetAccommodationListRQ value) {
        return new JAXBElement<GetAccommodationListRQ>(_GetAccommodationListRQ_QNAME, GetAccommodationListRQ.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccommodationListRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ws.avantio.com/crsConnectionServices/xsd", name = "GetAccommodationListRS")
    public JAXBElement<GetAccommodationListRS> createGetAccommodationListRS(GetAccommodationListRS value) {
        return new JAXBElement<GetAccommodationListRS>(_GetAccommodationListRS_QNAME, GetAccommodationListRS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRatesListRQ }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ws.avantio.com/crsConnectionServices/xsd", name = "GetRatesListRQ")
    public JAXBElement<GetRatesListRQ> createGetRatesListRQ(GetRatesListRQ value) {
        return new JAXBElement<GetRatesListRQ>(_GetRatesListRQ_QNAME, GetRatesListRQ.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRatesListRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ws.avantio.com/crsConnectionServices/xsd", name = "GetRatesListRS")
    public JAXBElement<GetRatesListRS> createGetRatesListRS(GetRatesListRS value) {
        return new JAXBElement<GetRatesListRS>(_GetRatesListRS_QNAME, GetRatesListRS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBookingRQ }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ws.avantio.com/crsConnectionServices/xsd", name = "GetBookingRQ")
    public JAXBElement<GetBookingRQ> createGetBookingRQ(GetBookingRQ value) {
        return new JAXBElement<GetBookingRQ>(_GetBookingRQ_QNAME, GetBookingRQ.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBookingRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ws.avantio.com/crsConnectionServices/xsd", name = "GetBookingRS")
    public JAXBElement<GetBookingRS> createGetBookingRS(GetBookingRS value) {
        return new JAXBElement<GetBookingRS>(_GetBookingRS_QNAME, GetBookingRS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsAvailableRQ }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ws.avantio.com/crsConnectionServices/xsd", name = "IsAvailableRQ")
    public JAXBElement<IsAvailableRQ> createIsAvailableRQ(IsAvailableRQ value) {
        return new JAXBElement<IsAvailableRQ>(_IsAvailableRQ_QNAME, IsAvailableRQ.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsAvailableRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ws.avantio.com/crsConnectionServices/xsd", name = "IsAvailableRS")
    public JAXBElement<IsAvailableRS> createIsAvailableRS(IsAvailableRS value) {
        return new JAXBElement<IsAvailableRS>(_IsAvailableRS_QNAME, IsAvailableRS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRatesRQ }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ws.avantio.com/crsConnectionServices/xsd", name = "GetRatesRQ")
    public JAXBElement<GetRatesRQ> createGetRatesRQ(GetRatesRQ value) {
        return new JAXBElement<GetRatesRQ>(_GetRatesRQ_QNAME, GetRatesRQ.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRatesRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ws.avantio.com/crsConnectionServices/xsd", name = "GetRatesRS")
    public JAXBElement<GetRatesRS> createGetRatesRS(GetRatesRS value) {
        return new JAXBElement<GetRatesRS>(_GetRatesRS_QNAME, GetRatesRS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllAccommodationListRQ }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ws.avantio.com/crsConnectionServices/xsd", name = "GetAllAccommodationListRQ")
    public JAXBElement<GetAllAccommodationListRQ> createGetAllAccommodationListRQ(GetAllAccommodationListRQ value) {
        return new JAXBElement<GetAllAccommodationListRQ>(_GetAllAccommodationListRQ_QNAME, GetAllAccommodationListRQ.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllAccommodationListRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ws.avantio.com/crsConnectionServices/xsd", name = "GetAllAccommodationListRS")
    public JAXBElement<GetAllAccommodationListRS> createGetAllAccommodationListRS(GetAllAccommodationListRS value) {
        return new JAXBElement<GetAllAccommodationListRS>(_GetAllAccommodationListRS_QNAME, GetAllAccommodationListRS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetBookingRQ }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ws.avantio.com/crsConnectionServices/xsd", name = "SetBookingRQ")
    public JAXBElement<SetBookingRQ> createSetBookingRQ(SetBookingRQ value) {
        return new JAXBElement<SetBookingRQ>(_SetBookingRQ_QNAME, SetBookingRQ.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetBookingRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ws.avantio.com/crsConnectionServices/xsd", name = "SetBookingRS")
    public JAXBElement<SetBookingRS> createSetBookingRS(SetBookingRS value) {
        return new JAXBElement<SetBookingRS>(_SetBookingRS_QNAME, SetBookingRS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDiscountsSupplementsRQ }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ws.avantio.com/crsConnectionServices/xsd", name = "GetDiscountsSupplementsRQ")
    public JAXBElement<GetDiscountsSupplementsRQ> createGetDiscountsSupplementsRQ(GetDiscountsSupplementsRQ value) {
        return new JAXBElement<GetDiscountsSupplementsRQ>(_GetDiscountsSupplementsRQ_QNAME, GetDiscountsSupplementsRQ.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDiscountsSupplementsRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ws.avantio.com/crsConnectionServices/xsd", name = "GetDiscountsSupplementsRS")
    public JAXBElement<GetDiscountsSupplementsRS> createGetDiscountsSupplementsRS(GetDiscountsSupplementsRS value) {
        return new JAXBElement<GetDiscountsSupplementsRS>(_GetDiscountsSupplementsRS_QNAME, GetDiscountsSupplementsRS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGeographicAreasRQ }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ws.avantio.com/crsConnectionServices/xsd", name = "GetGeographicAreasRQ")
    public JAXBElement<GetGeographicAreasRQ> createGetGeographicAreasRQ(GetGeographicAreasRQ value) {
        return new JAXBElement<GetGeographicAreasRQ>(_GetGeographicAreasRQ_QNAME, GetGeographicAreasRQ.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGeographicAreasRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ws.avantio.com/crsConnectionServices/xsd", name = "GetGeographicAreasRS")
    public JAXBElement<GetGeographicAreasRS> createGetGeographicAreasRS(GetGeographicAreasRS value) {
        return new JAXBElement<GetGeographicAreasRS>(_GetGeographicAreasRS_QNAME, GetGeographicAreasRS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccommodationDataRQ }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ws.avantio.com/crsConnectionServices/xsd", name = "GetAccommodationDataRQ")
    public JAXBElement<GetAccommodationDataRQ> createGetAccommodationDataRQ(GetAccommodationDataRQ value) {
        return new JAXBElement<GetAccommodationDataRQ>(_GetAccommodationDataRQ_QNAME, GetAccommodationDataRQ.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccommodationDataRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ws.avantio.com/crsConnectionServices/xsd", name = "GetAccommodationDataRS")
    public JAXBElement<GetAccommodationDataRS> createGetAccommodationDataRS(GetAccommodationDataRS value) {
        return new JAXBElement<GetAccommodationDataRS>(_GetAccommodationDataRS_QNAME, GetAccommodationDataRS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccommodationStatusRQ }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ws.avantio.com/crsConnectionServices/xsd", name = "GetAccommodationStatusRQ")
    public JAXBElement<GetAccommodationStatusRQ> createGetAccommodationStatusRQ(GetAccommodationStatusRQ value) {
        return new JAXBElement<GetAccommodationStatusRQ>(_GetAccommodationStatusRQ_QNAME, GetAccommodationStatusRQ.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccommodationStatusRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ws.avantio.com/crsConnectionServices/xsd", name = "GetAccommodationStatusRS")
    public JAXBElement<GetAccommodationStatusRS> createGetAccommodationStatusRS(GetAccommodationStatusRS value) {
        return new JAXBElement<GetAccommodationStatusRS>(_GetAccommodationStatusRS_QNAME, GetAccommodationStatusRS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCommentRQ }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ws.avantio.com/crsConnectionServices/xsd", name = "AddCommentRQ")
    public JAXBElement<AddCommentRQ> createAddCommentRQ(AddCommentRQ value) {
        return new JAXBElement<AddCommentRQ>(_AddCommentRQ_QNAME, AddCommentRQ.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BooleanResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ws.avantio.com/crsConnectionServices/xsd", name = "AddCommentRS")
    public JAXBElement<BooleanResponse> createAddCommentRS(BooleanResponse value) {
        return new JAXBElement<BooleanResponse>(_AddCommentRS_QNAME, BooleanResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelBookingRQ }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ws.avantio.com/crsConnectionServices/xsd", name = "CancelBookingRQ")
    public JAXBElement<CancelBookingRQ> createCancelBookingRQ(CancelBookingRQ value) {
        return new JAXBElement<CancelBookingRQ>(_CancelBookingRQ_QNAME, CancelBookingRQ.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelBookingRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ws.avantio.com/crsConnectionServices/xsd", name = "CancelBookingRS")
    public JAXBElement<CancelBookingRS> createCancelBookingRS(CancelBookingRS value) {
        return new JAXBElement<CancelBookingRS>(_CancelBookingRS_QNAME, CancelBookingRS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAvailabilitiesRQ }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ws.avantio.com/crsConnectionServices/xsd", name = "GetAvailabilitiesRQ")
    public JAXBElement<GetAvailabilitiesRQ> createGetAvailabilitiesRQ(GetAvailabilitiesRQ value) {
        return new JAXBElement<GetAvailabilitiesRQ>(_GetAvailabilitiesRQ_QNAME, GetAvailabilitiesRQ.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAvailabilitiesRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ws.avantio.com/crsConnectionServices/xsd", name = "GetAvailabilitiesRS")
    public JAXBElement<GetAvailabilitiesRS> createGetAvailabilitiesRS(GetAvailabilitiesRS value) {
        return new JAXBElement<GetAvailabilitiesRS>(_GetAvailabilitiesRS_QNAME, GetAvailabilitiesRS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccommodationKindsRQ }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ws.avantio.com/crsConnectionServices/xsd", name = "GetAccommodationKindsRQ")
    public JAXBElement<GetAccommodationKindsRQ> createGetAccommodationKindsRQ(GetAccommodationKindsRQ value) {
        return new JAXBElement<GetAccommodationKindsRQ>(_GetAccommodationKindsRQ_QNAME, GetAccommodationKindsRQ.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccommodationKindsRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ws.avantio.com/crsConnectionServices/xsd", name = "GetAccommodationKindsRS")
    public JAXBElement<GetAccommodationKindsRS> createGetAccommodationKindsRS(GetAccommodationKindsRS value) {
        return new JAXBElement<GetAccommodationKindsRS>(_GetAccommodationKindsRS_QNAME, GetAccommodationKindsRS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetExternalIDsRQ }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ws.avantio.com/crsConnectionServices/xsd", name = "GetExternalIDsRQ")
    public JAXBElement<GetExternalIDsRQ> createGetExternalIDsRQ(GetExternalIDsRQ value) {
        return new JAXBElement<GetExternalIDsRQ>(_GetExternalIDsRQ_QNAME, GetExternalIDsRQ.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetExternalIDsRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ws.avantio.com/crsConnectionServices/xsd", name = "GetExternalIDsRS")
    public JAXBElement<GetExternalIDsRS> createGetExternalIDsRS(GetExternalIDsRS value) {
        return new JAXBElement<GetExternalIDsRS>(_GetExternalIDsRS_QNAME, GetExternalIDsRS.class, null, value);
    }

}
