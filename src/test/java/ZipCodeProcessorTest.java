import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.galvanize.ZipCodeProcessor;
import com.galvanize.Verifier;


import static org.junit.jupiter.api.Assertions.assertEquals;


public class ZipCodeProcessorTest {
    Verifier verifier;



    private ZipCodeProcessor ZipCodeProcessor;
    // write your tests here

    @BeforeEach
    public void setUp() {
        this.ZipCodeProcessor = new ZipCodeProcessor(verifier);
        this.verifier = new Verifier();
    }

    @Test
    public void assertTrue() {
        assertEquals(true, true);
    }

    @Test
    public void assertZipcodeIsValid() {
        verifier = new Verifier();
        ZipCodeProcessor = new ZipCodeProcessor(verifier);
        assertEquals("Thank you! Your package will arrive soon.", ZipCodeProcessor.process("80302"));
    }
    @Test
    public void assertZipcodeIsOutOfRange() {
        verifier = new Verifier();
        ZipCodeProcessor = new ZipCodeProcessor(verifier);
        assertEquals("We're sorry, but the zip code you entered is out of our range.", ZipCodeProcessor.process("12234"));
    }
    @Test
    public void assertZipcodeLengthIsToLong() {
        verifier = new Verifier();
        ZipCodeProcessor = new ZipCodeProcessor(verifier);
        assertEquals("The zip code you entered was the wrong length.", ZipCodeProcessor.process("2345678"));
    }

    @Test
    public void assertZipcodeLengthIsToShort() {
        verifier = new Verifier();
        ZipCodeProcessor = new ZipCodeProcessor(verifier);
        assertEquals("The zip code you entered was the wrong length.", ZipCodeProcessor.process("321"));
    }

}