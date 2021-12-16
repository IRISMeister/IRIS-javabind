# Good ole JavaBinding...
https://docs.intersystems.com/latest/csp/docbook/DocBook.UI.Page.cls?KEY=TJAV  

 Data are populated by using https://github.com/intersystems/Samples-Data

To regenerate java classes, add following one line to Sample.Employee.cls and compile it. 
 ```
 Projection NewProjection1 As %Projection.Java;
 ```