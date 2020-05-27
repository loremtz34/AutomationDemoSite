#Autor:
@Stories
Feature: Web Automation Demo Site
  Descripcion aqui
  @scenario1
  Scenario: Automatizacion reto 1
    Given que Carlos quiere acceder a la Web Automation Demo Site
    When el realiza el registro en la pagina
    | Name   | LastName | Address    | EmailAddress       | Phone   | Gender | Hobbies | Languages | Skills | Country  | SelectCountry | Year | Month | Day | Password | ConfirmPassword|
    | Carlos |  Antonio | calle 1 -1 | carlos@yopmail.com | 1234567 | Male   | Cricket | Arabic    | C++    | Colombia | Denmark       | 1996 | May   | 14  | 123456   |12345           |
    Then el verifica que se carga la pantalla con texto Double Click on Edito Icon to EDIT the Table Row
