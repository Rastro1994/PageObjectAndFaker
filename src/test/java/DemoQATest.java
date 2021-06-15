import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;

public class DemoQATest extends TestBase {
    Faker faker = new Faker();
    String firstName = faker.name().firstName(),
            url = "https://demoqa.com/automation-practice-form",
            lastName = faker.name().lastName(),
            email = faker.internet().emailAddress(),
            gender = "Male",
            number = faker.phoneNumber().subscriberNumber(10),
            day = "28",
            month = "June",
            year = "1992",
            subject = "English",
            hobbie = "Sports",
            picture = "3123123.jpg",
            address = faker.address().fullAddress(),
            state = "NCR",
            city = "Noida";



    @Test
    void fillFormTest() {

        PageObjects.openPage(url);
        PageObjects.setFirstName(firstName);
        PageObjects.setLastName(lastName);
        PageObjects.setEmail(email);
        PageObjects.setGender(gender);
        PageObjects.setPhoneNumber(number);
        PageObjects.setBirthDate(year, month, day);
        PageObjects.setSubjects(subject);
        PageObjects.setHobbies(hobbie);
        PageObjects.uploadFile(picture);
        PageObjects.setAddress(address);
        PageObjects.chooseState(state);
        PageObjects.chooseCity(city);
        PageObjects.clickSubmit();
        PageObjects.checkData(firstName, lastName, email, gender, number, year, month, day, subject, hobbie, picture);

    }
}

