/**
 * 
 */
package com.soap.consumer.operation;

import java.util.Map;

import javax.validation.ValidationException;

import com.soap.consumer.domain.GetAccommodationListRQ;

/**
 * @author peremanent
 *
 */
public class GetAccommodationList extends SoapOperationImpl{

	private static final String OPERATION = "GetAccommodationList";

	public GetAccommodationList() {
		super(OPERATION);
	}
	/**
	 * <soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:xsd="ws.avantio.com/crsConnectionServices/xsd" xmlns:crs="ws.avantio.com/crsConnectionServices">
   <soapenv:Header/>
   <soapenv:Body>
      <xsd:GetAccommodationListRQ>
         <crs:Credentials>
            <!--Optional:-->
            <crs:Language>?</crs:Language>
            <crs:UserName>?</crs:UserName>
            <crs:Password>?</crs:Password>
         </crs:Credentials>
         <crs:Criteria>
            <!--Optional:-->
            <crs:Occupants>
               <crs:AdultsNumber>?</crs:AdultsNumber>
               <!--Optional:-->
               <crs:Child1_Age>?</crs:Child1_Age>
               <!--Optional:-->
               <crs:Child2_Age>?</crs:Child2_Age>
               <!--Optional:-->
               <crs:Child3_Age>?</crs:Child3_Age>
               <!--Optional:-->
               <crs:Child4_Age>?</crs:Child4_Age>
               <!--Optional:-->
               <crs:Child5_Age>?</crs:Child5_Age>
               <!--Optional:-->
               <crs:Child6_Age>?</crs:Child6_Age>
            </crs:Occupants>
            <!--Optional:-->
            <crs:Purpose>?</crs:Purpose>
            <!--Optional:-->
            <crs:DateFrom>?</crs:DateFrom>
            <!--Optional:-->
            <crs:DateTo>?</crs:DateTo>
            <!--Optional:-->
            <crs:RegionCode>?</crs:RegionCode>
            <!--Optional:-->
            <crs:AreaCode>?</crs:AreaCode>
            <!--Optional:-->
            <crs:CityCode>?</crs:CityCode>
            <!--Optional:-->
            <crs:LocalityCode>?</crs:LocalityCode>
            <!--Optional:-->
            <crs:KindCode>?</crs:KindCode>
            <!--Optional:-->
            <crs:ResortCode>?</crs:ResortCode>
            <!--Optional:-->
            <crs:Bedrooms>?</crs:Bedrooms>
            <!--Optional:-->
            <crs:AccommodationName>?</crs:AccommodationName>
            <!--Optional:-->
            <crs:SwimmingPool>?</crs:SwimmingPool>
            <!--Optional:-->
            <crs:TV>?</crs:TV>
            <!--Optional:-->
            <crs:Satellite>?</crs:Satellite>
            <!--Optional:-->
            <crs:AirConditioned>?</crs:AirConditioned>
            <!--Optional:-->
            <crs:Heating>?</crs:Heating>
            <!--Optional:-->
            <crs:Garage>?</crs:Garage>
            <!--Optional:-->
            <crs:Microwaves>?</crs:Microwaves>
            <!--Optional:-->
            <crs:HandicappedFacilities>?</crs:HandicappedFacilities>
            <!--Optional:-->
            <crs:PetsAllowed>?</crs:PetsAllowed>
            <!--Optional:-->
            <crs:Parking>?</crs:Parking>
            <!--Optional:-->
            <crs:WashingMachine>?</crs:WashingMachine>
            <!--Optional:-->
            <crs:Dishwasher>?</crs:Dishwasher>
            <!--Optional:-->
            <crs:ProximityToSea>
               <crs:Distance>?</crs:Distance>
               <crs:Unit>?</crs:Unit>
            </crs:ProximityToSea>
            <!--Optional:-->
            <crs:ProximityToSupermarket>
               <crs:Distance>?</crs:Distance>
               <crs:Unit>?</crs:Unit>
            </crs:ProximityToSupermarket>
            <!--Optional:-->
            <crs:ProximityToGolf>
               <crs:Distance>?</crs:Distance>
               <crs:Unit>?</crs:Unit>
            </crs:ProximityToGolf>
            <!--Optional:-->
            <crs:ProximityToCity>
               <crs:Distance>?</crs:Distance>
               <crs:Unit>?</crs:Unit>
            </crs:ProximityToCity>
         </crs:Criteria>
         <!--Optional:-->
         <crs:OrderCriteria>
            <crs:FieldCriteria>?</crs:FieldCriteria>
            <crs:DirectionOrder>?</crs:DirectionOrder>
         </crs:OrderCriteria>
      </xsd:GetAccommodationListRQ>
   </soapenv:Body>
</soapenv:Envelope>
	 */
	@Override
	public void validate() throws ValidationException {
		Map<String, String> params = this.getParams();
		String username = params.get(SoapOperationProperties.USERNAME_PARAM_LABEL);
		String password = params.get(SoapOperationProperties.PASSWORD_PARAM_LABEL);

		if (username == null) {
			throw new ValidationException("UserName is required");
		} else if (password == null) {
			throw new ValidationException("Password is required");
		}
	}

	@Override
	public Object createRequest() {
		GetAccommodationListRQ request = new GetAccommodationListRQ();
		
		return request;
	}

}
