<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>POST</name>
   <tag></tag>
   <elementGuidId>43ecc977-7e2c-462d-98e7-9df50274aac2</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;productCode\&quot;: \&quot;${Prod_Name}\&quot;,\n  \&quot;productVersion\&quot;: \&quot;1\&quot;,\n  \&quot;coverTypeCode\&quot;: \&quot;WIS\&quot;,\n  \&quot;coverVersion\&quot;: \&quot;1\&quot;,\n  \&quot;coverVersionId\&quot;: \&quot;175\&quot;,\n  \&quot;policyStartDate\&quot;: \&quot;2019-03-08 12:01:00\&quot;,\n  \&quot;transactionType\&quot;: \&quot;NB\&quot;,\n  \&quot;policyEndDate\&quot;: \&quot;2019-03-14 10:30:59\&quot;,\n  \&quot;questionSetBaGroupWise\&quot;: {\n    \&quot;WI\&quot;: {\n      \&quot;questionSet\&quot;: {\n        \&quot;Cho1\&quot;: [\n          {\n            \&quot;Sum1\&quot;: \&quot;${Sum1}\&quot;,\n            \&quot;Sum2\&quot;: \&quot;${Sum2}\&quot;,\n            \&quot;Sum3\&quot;: \&quot;${Sum3}\&quot;,\n            \&quot;Sum4\&quot;: \&quot;${Sum4}\&quot;\n          }\n        ]\n      },\n      \&quot;prevHoldingBreakup\&quot;: [\n        {\n          \&quot;insurerEntityCode\&quot;: \&quot;IPINs\&quot;,\n          \&quot;riskCode\&quot;: \&quot;riskcode Content\&quot;,\n          \&quot;contractCode\&quot;: \&quot;IB\&quot;,\n          \&quot;contractVersion\&quot;: \&quot;1\&quot;,\n          \&quot;sectionCode\&quot;: \&quot;cc\&quot;,\n          \&quot;entityBreakup\&quot;: [\n            {\n              \&quot;entityCode\&quot;: \&quot;rajibBroker\&quot;,\n              \&quot;commissionValue\&quot;: \&quot;120.0100\&quot;\n            },\n            {\n              \&quot;entityCode\&quot;: \&quot;RMGA123\&quot;,\n              \&quot;commissionValue\&quot;: \&quot;24.0020\&quot;\n            },\n            {\n              \&quot;entityCode\&quot;: \&quot;IPINs\&quot;,\n              \&quot;commissionValue\&quot;: \&quot;1032.0860\&quot;\n            }\n          ],\n          \&quot;feeBreakup\&quot;: [\n            {\n              \&quot;feeCode\&quot;: \&quot;LBF\&quot;,\n              \&quot;feeValue\&quot;: \&quot;12.0010\&quot;\n            },\n            {\n              \&quot;feeCode\&quot;: \&quot;BF\&quot;,\n              \&quot;feeValue\&quot;: \&quot;12.0010\&quot;\n            }\n          ]\n        }\n      ],\n      \&quot;bindingAuthorityContract\&quot;: [\n        {\n          \&quot;contractCode\&quot;: \&quot;IB\&quot;,\n          \&quot;coverholderCode\&quot;: \&quot;RMGA123\&quot;,\n          \&quot;endorsement_no\&quot;: \&quot;1\&quot;,\n          \&quot;sectionCode\&quot;: \&quot;cc\&quot;,\n          \&quot;placingOrder\&quot;: \&quot;100\&quot;,\n          \&quot;sectionDetails\&quot;: {\n            \&quot;riskCodesSplit\&quot;: {\n              \&quot;riskcode Content\&quot;: \&quot;100.00\&quot;\n            },\n            \&quot;holdingSplit\&quot;: [\n              {\n                \&quot;insurerEntityCode\&quot;: \&quot;IPINs\&quot;,\n                \&quot;riskCode\&quot;: \&quot;riskcode Content\&quot;,\n                \&quot;holdingPercentage\&quot;: \&quot;100.0000\&quot;,\n                \&quot;binderFeeIsPercentageOrFlat\&quot;: \&quot;1\&quot;,\n                \&quot;binderFee\&quot;: \&quot;1.00\&quot;,\n                \&quot;londonBrokerFeeIsPercentageOrFlat\&quot;: \&quot;1\&quot;,\n                \&quot;londonBrokerFee\&quot;: \&quot;1.00\&quot;,\n                \&quot;commissionIsPercentageOrFlat\&quot;: \&quot;1\&quot;,\n                \&quot;commission\&quot;: \&quot;12.00\&quot;\n              }\n            ]\n          }\n        }\n      ]\n    }\n  },\n  \&quot;tobaContract\&quot;: {\n    \&quot;brokerageDetails\&quot;: [\n      {\n        \&quot;entityCode\&quot;: \&quot;rajibBroker\&quot;,\n        \&quot;isFlatOrPerc\&quot;: \&quot;1\&quot;,\n        \&quot;entityCommissionValue\&quot;: \&quot;15.00\&quot;,\n        \&quot;isGwpOrTotalBrokerage\&quot;: \&quot;1\&quot;\n      }\n    ]\n  },\n  \&quot;countryCode\&quot;: \&quot;IN\&quot;,\n  \&quot;taxRateDetails\&quot;: [\n    {\n      \&quot;tax_id\&quot;: \&quot;1\&quot;,\n      \&quot;tax_short_code\&quot;: \&quot;VAT\&quot;,\n      \&quot;tax_version_id\&quot;: \&quot;1\&quot;,\n      \&quot;version_no\&quot;: \&quot;1\&quot;,\n      \&quot;status\&quot;: \&quot;3\&quot;,\n      \&quot;tax_name\&quot;: \&quot;vat\&quot;,\n      \&quot;tax_details\&quot;: \&quot;vat\&quot;,\n      \&quot;rate_percentage\&quot;: \&quot;14.00\&quot;,\n      \&quot;flat_rate\&quot;: \&quot;0.00\&quot;,\n      \&quot;flat_rate_currancy\&quot;: \&quot;4\&quot;,\n      \&quot;is_allowance\&quot;: \&quot;0\&quot;,\n      \&quot;full_on_inception\&quot;: \&quot;No\&quot;,\n      \&quot;paid_to\&quot;: \&quot;1\&quot;,\n      \&quot;paid_by\&quot;: \&quot;2\&quot;,\n      \&quot;tax_applicable_on\&quot;: \&quot;1\&quot;,\n      \&quot;applicable_date\&quot;: \&quot;2018-09-26\&quot;,\n      \&quot;endorsement_based_on\&quot;: \&quot;2\&quot;,\n      \&quot;endorsement_mta_date\&quot;: \&quot;2019-01-02\&quot;,\n      \&quot;reason\&quot;: \&quot;\&quot;,\n      \&quot;date_added\&quot;: \&quot;2018-09-26 14:51:38\&quot;,\n      \&quot;date_updated\&quot;: \&quot;2019-01-08 07:25:33\&quot;,\n      \&quot;administeredBy\&quot;: \&quot;1\&quot;\n    }\n  ]\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
   </httpHeaderProperties>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>http://118.185.9.181/project/dev/markitcore_sudipta/Sites/bre/clients/callFromKatalon?</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <variables>
      <defaultValue>findTestData('ProductDetails').getValue(1, 1)</defaultValue>
      <description></description>
      <id>e1e43374-16c3-464d-8755-0af2fd1ae0df</id>
      <masked>false</masked>
      <name>Prod_Name</name>
   </variables>
   <variables>
      <defaultValue>findTestData('ProductDetails').getValue(1, 1)</defaultValue>
      <description></description>
      <id>2637b1d7-c47d-44fd-92f5-61632b91c01b</id>
      <masked>false</masked>
      <name>Sum1</name>
   </variables>
   <variables>
      <defaultValue>findTestData('ProductDetails').getValue(1, 1)</defaultValue>
      <description></description>
      <id>17cbdc72-9f70-411a-aa8a-58c99d5b17a5</id>
      <masked>false</masked>
      <name>Sum2</name>
   </variables>
   <variables>
      <defaultValue>findTestData('ProductDetails').getValue(1, 1)</defaultValue>
      <description></description>
      <id>b03b9eb2-66b4-4305-9be8-5837d7a971be</id>
      <masked>false</masked>
      <name>Sum3</name>
   </variables>
   <variables>
      <defaultValue>findTestData('ProductDetails').getValue(1, 1)</defaultValue>
      <description></description>
      <id>1205dab4-cb58-4a57-a46d-4dc378a3e44c</id>
      <masked>false</masked>
      <name>Sum4</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()



WS.verifyResponseStatusCode(response, 200)

assertThat(response.getStatusCode()).isEqualTo(200)


//WS.verifyElementPropertyValue(response, 'questionSetBaGroupWise.WI.questionSet.Cho1[0].Sum1', 1200)


</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
