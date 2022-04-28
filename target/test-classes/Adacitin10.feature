Feature: Generating 10 order id from adacitin hotel page
Scenario Outline: Genrating order id
Given user is on Adacitin hotel app on chrome browser
When user enter "<username>" and "<password>"
And user should click on login buton
When user select "<location>", "<hotels>" "<roomtype>", "<noofrooms>", "<Checkindate>", "<Chechoutdate>", "<Adultperroom>", "<Childperroom>" And click continue button
When user select the hotel and click continue for booking
When user enter"<firstname>", "<lastname>", "<billingaddress>", "<cardno>", "<cardtype>", "<expmonth>", "<expyear>"and "<cvv>"
And user click on continue for genrating order id
And user print order Id to console

Examples:
|username  |password |location |hotels        |roomtype|noofrooms|Checkindate|Checkoutdate|Adultperroom|Childperroom|firstname|lastname|billingaddress                |cardno          |cardtype|expmonth|expyear|cvv|
|INIGOMESSI|raja@92  |New York |Hotel Sunshine|Double  |2        |22/04/2022 |23/04/2022  |2           |2           |INIGO    |RAJA    |8/144,East street,HrKOTTAI.DGL|6381162847958504|VISA    |7       |2022   |786|
|INIGOMESSI|raja@92  |New York |Hotel Sunshine|Double  |2        |22/04/2022 |23/04/2022  |2           |2           |INIGO    |RAJA    |8/144,East street,HrKOTTAI.DGL|6381162847958504|VISA    |7       |2022   |786|
|INIGOMESSI|raja@92  |New York |Hotel Sunshine|Double  |2        |22/04/2022 |23/04/2022  |2           |2           |INIGO    |RAJA    |8/144,East street,HrKOTTAI.DGL|6381162847958504|VISA    |7       |2022   |786|
|INIGOMESSI|raja@92  |New York |Hotel Sunshine|Double  |2        |22/04/2022 |23/04/2022  |2           |2           |INIGO    |RAJA    |8/144,East street,HrKOTTAI.DGL|6381162847958504|VISA    |7       |2022   |786|
|INIGOMESSI|raja@92  |New York |Hotel Sunshine|Double  |1        |22/04/2022 |23/04/2022  |1           |1           |INIGO    |RAJA    |8/144,East street,HrKOTTAI.DGL|6381162847958504|VISA    |7       |2022   |786|
|INIGOMESSI|raja@92  |New York |Hotel Sunshine|Double  |1        |22/04/2022 |23/04/2022  |1           |1           |INIGO    |RAJA    |8/144,East street,HrKOTTAI.DGL|6381162847958504|VISA    |7       |2022   |786|
|INIGOMESSI|raja@92  |New York |Hotel Sunshine|Double  |1        |22/04/2022 |23/04/2022  |1           |1           |INIGO    |RAJA    |8/144,East street,HrKOTTAI.DGL|6381162847958504|VISA    |7       |2022   |786|
|INIGOMESSI|raja@92  |New York |Hotel Sunshine|Double  |1        |22/04/2022 |23/04/2022  |1           |1           |INIGO    |RAJA    |8/144,East street,HrKOTTAI.DGL|6381162847958504|VISA    |7       |2022   |786|
|INIGOMESSI|raja@92  |New York |Hotel Sunshine|Double  |1        |22/04/2022 |23/04/2022  |1           |1           |INIGO    |RAJA    |8/144,East street,HrKOTTAI.DGL|6381162847958504|VISA    |7       |2022   |786|
|INIGOMESSI|raja@92  |New York |Hotel Sunshine|Double  |1        |22/04/2022 |23/04/2022  |1           |1           |INIGO    |RAJA    |8/144,East street,HrKOTTAI.DGL|6381162847958504|VISA    |7       |2022   |786|
  
