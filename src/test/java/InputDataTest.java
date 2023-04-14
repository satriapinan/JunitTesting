import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class InputDataTest {

    @Test
    @DisplayName("Add Makanan")
    void makananTest() {
    Makanan food = new Makanan("Makanan1", "Roti", "Karbohidrat", "MakananPokok", "P01A");
        assertAll(
                "Grouped Assertions of Food",
                () -> assertEquals("Makanan1", food.getKode(), "Code of food should be Makanan1"),
                () -> assertEquals("Roti", food.getNama(), "Name of food should be Roti"),
                () -> assertEquals("Karbohidrat", food.getKandunganGizi(), "Nutrient content should be Karbohidrat"),
                () -> assertTrue(Arrays.asList("MakananPokok", "MakananPendamping", "Snack").contains(food.getJenis()), "Type of food should be one of MakananPokok, MakananPendamping, or Snack"),
                () -> assertEquals("P01A", food.getNoIjinPabrik(), "Factory license number should be P01A")
        );
    }

    @Test
    @DisplayName("Add Minuman")
    void minumanTest() {
        Minuman drink = new Minuman("Minuman1", "AirMineral", 0, "AirBersih", "P01B");
        assertAll(
                "Grouped Assertions of Food",
                () -> assertEquals("Minuman1", drink.getKode(), "Code of drink should be Minuman1"),
                () -> assertEquals("AirMineral", drink.getNama(), "Name of drink should be AirMineral"),
                () -> assertEquals(0, drink.getKandunganGula(), "Sugar content should be 0"),
                () -> assertTrue(Arrays.asList("AirBersih", "Suplemen", "Buah").contains(drink.getJenis()), "Type of drink should be one of AirBersih, Suplemen, or Buah"),
                () -> assertEquals("P01B", drink.getNoIjinPabrik(), "Factory license number should be P01B")
        );
    }

    @Test
    @DisplayName("Add Obat")
    void obatTest() {
        Obat medicine = new Obat("Obat1", "Decolgen", "Umum", 3, "Tablet", "Pilek", "P01C");
        assertAll(
                "Grouped Assertions of Food",
                () -> assertEquals("Obat1", medicine.getKode(), "Code of medicine should be Obat1"),
                () -> assertEquals("Decolgen", medicine.getNama(), "Name of code should be Decolgen"),
                () -> assertEquals("Umum", medicine.getJenis(), "Code type should be Umum"),
                () -> assertTrue(Arrays.asList(1, 2, 3).contains(medicine.getDosisPerHari()), "Dose per day should be between 1 to 3"),
                () -> assertEquals("Tablet", medicine.getBentuk(), "Medicine form number should be Tablet"),
                () -> assertEquals("Pilek", medicine.getPenyakit(), "Disease should be Pilek"),
                () -> assertEquals("P01C", medicine.getNoIjinPabrik(), "Factory license number should be P01C")
        );
    }

}
