# GridBagConstraintsBuilder
A Builder for Swing GridBagConstraints to ease the creation of Gridbag-Layouts. 
Instead of having a long parameter list of the GridBagConstraints  constructor the builder
provides named methods. 

Example:

```Java
GridBagContraintsBuilder gbb = new GridBagContraintsBuilder();

mainPanel.add(firstRowFirstCol, gbb.x(0).y(0).insets(5).build());
mainPanel.add(firstRowSecondCol, gbb.x(1).y(0).insets(5).rowRemainder().build());

mainPanel.add(secondRowFirstCol, gbb.x(0).y(1).insets(5).build());
mainPanel.add(secondRowSecondCol, gbb.x(1).y(1).insets(5).build());
mainPanel.add(secondRowThirdCol, gbb.x(2).y(1).insets(5).build());

mainPanel.add(thirdRowFirstCol, gbb.x(0).y(2).insets(5).build());
mainPanel.add(thirdRowSecondCol, gbb.x(1).y(2).insets(5).growHorizontal().rowRemainder().build());

mainPanel.add(fourthRowFirstCol, gbb.x(0).y(3).insets(5).build());
mainPanel.add(fourthRowSecondCol, gbb.x(1).y(3).insets(5).south().build());
mainPanel.add(fourthRowThirdCol, gbb.x(2).y(3).insets(5).growBoth().build());

mainPanel.add(fifthRowFirstCol, gbb.x(0).y(4).insets(5).build());
mainPanel.add(fifthRowSecondCol, gbb.x(1).y(4).insets(5).build());
mainPanel.add(fifthRowThirdCol, gbb.x(2).y(4).insets(5).east().build());
```

![Screenshot](gridbagcontraintsbuilder-test/resources/exampleScreenshot.JPG?raw=true "Title")


