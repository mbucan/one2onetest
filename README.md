# one2onetest
Answer to Alexander

Steps:
1. Create entity Passport
   - @NamePattern("%s|passportNumber") or in the visual designer Instance name should be %s|passportNumber (this will be used to display the data in the lookup field)  
3. Create entity Person
  - when done with usual attributes, add last one , name - "passport" Attribute Type - COMPOSITION , Type - "Passport" , Cardinality - One to One
4. Rightclick Person entity, create view "person-view"  - this will be used to create edit and browse form, and in JPA query later.   
5. Create new screen from Passport , Entity browser and editor screens
6. Create new screen from Person , Entity browser and editor screens, use person-view for both browse and edit screen

So far so good, you can CRUD Person and Passport in Person browse , now to have indicator in Passport edit as to which person it belongs to.
(because you can't have Person attribute added to Passport)

7. Edit passport-edit.xml to add textfields , enabled is false so they cant be changed
                    <textField id="personNameField" enable="false" caption="Name"/>
                    <textField id="personSurnameField" enable="false" caption="Surname"/>
8. We need to populate this field with desired data, in this case name and surname, to do that we will add loadPersonByPassportNumber method to PassportEdit,
    and use it onAfterShow event of the screen, that is triggered every time screen is showed. I'm using Optional because if query result is empty,
    then the result is convenient.                     
    
