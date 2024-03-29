package co.com.petstore.testing.questions;

import io.restassured.path.json.JsonPath;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.petstore.testing.utils.ConstantString.*;

public class VerifyPetAdded implements Question<Boolean> {


    public static VerifyPetAdded jsonResponse() {
        return new VerifyPetAdded();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        JsonPath jsonResponse = actor.recall(JSON_RESPONSE);
        String petNameObtained = jsonResponse.get(NAME_FIELD).toString();
        String petNameExpected = actor.recall(PET_NAME).toString();
        return petNameObtained.equals(petNameExpected);
    }
}
