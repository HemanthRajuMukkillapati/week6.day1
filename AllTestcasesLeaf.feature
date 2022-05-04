Feature: All Test Cases run in a single feature file



Background: 
Given Open the chrome browser
And Load url
And Enter username as 'Demosalesmanager'
And Enter Password as 'crmsfa'
When Click on the Login button
Given click on the  CRMCSF link

Scenario Outline: TC001_Create Contact


And Click on contacts
And click on create contact
And enter first name as <fstName>
And enter last name as <lstName>
And enter first name local as <fstLName>
And enter lastname local as <lstLName>
And enter department name as <deptName>
And enter contact desc as <ctDesc>
And enter prim email as <pEmail>
And Select State Province as <sProv>
When click create contact
Then View contacts page is displayed


Examples:
|fstName||lstName||fstLName||lstLName||deptName||ctDesc||pEmail||sProv|
|'TestLeafFirst'||'TestLeaflast'| |'TestLeafFirstLocal'| |'TestLeafLastLocal'| |'Testdepartment'| |'TestDesc'| |'testleafhetty@testleaf.com'| |'New York'|
|'Hetty'||'Test'| |'FirstLocal'| |'LeafLastLocal'| |'departmentTest'| |'DescTes'| |'testleafhetty91@testleaf.com'| |'Alaska'|



Scenario: TC002_Create Lead


Given click on Leads
And click on Create Lead
And enter Company name as 'Test Company'
And enter the first name as 'Test FirstName'
And enter the last name as 'Test FirstName'  
And enter source drop down value as 'Employee'	
When click on submit
Then verify source drop down value and print
Then get the page title and print


Scenario: TC003_Edit Lead


Given click on Leads
And click on Create Lead
And enter Company name as 'Test Company'
And enter the first name as 'Test FirstName'
And enter the last name as 'Test FirstName'  
And enter source drop down value as 'Employee'
When click on submit
Then get the page title and print
When Click on edit button
Given Clear the Description Field
And Fill ImportantNote Field with Any text
When Click on update button
Then Get the Title of Resulting Page and compare


Scenario: TC004_Dup Lead


Given click on Leads
And click on Create Lead
And enter Company name as 'Test Company'
And enter the first name as 'Test FirstName'
And enter the last name as 'Test FirstName'  
And enter source drop down value as 'Employee'
When click on submit
Then get the page title and print
When click on Duplicate
Given Dupcompany name as 'company updated to new'
Given Dupfirst Name as 'UpdatedName'
When click on Dupsubmit button
Then compare titles


Scenario: TC005_Del Lead



Given click on Leads
And click on find leads button
And clear on phone
And clear country code
And click on find button
And Get and Print First Lead
When View and click on delete
Then click on find leads button
Given enter first lead id
When click on find button
Then get no of records and compare


