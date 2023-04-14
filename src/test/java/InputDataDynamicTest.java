import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class InputDataDynamicTest {
    @TestFactory
    Stream<DynamicTest> dynamicTestsForFoodObjects() {
        List<Makanan> inputFoodList = Arrays.asList(
                new Makanan("Makanan1", "Roti", "Karbohidrat", "MakananPokok", "P01A"),
                new Makanan("Makanan2", "Nasi Goreng", "Karbohidrat", "MakananPokok", "P01B"),
                new Makanan("Makanan3", "Burger", "Karbohidrat", "Snack", "P01C")
        );

        Stream<DynamicTest> foodObjectStream = inputFoodList.stream()
                .map(food -> DynamicTest.dynamicTest(
                        "Test food object: " + food.getKode(),
                        () -> {
                            assertAll("Grouped assertions of food",
                                    () -> assertEquals(food.getKode(), food.getKode(), "Code of food should be the same"),
                                    () -> assertEquals(food.getNama(), food.getNama(), "Name of food should be the same"),
                                    () -> assertEquals(food.getKandunganGizi(), food.getKandunganGizi(), "Nutrient content should be the same"),
                                    () -> assertTrue(Arrays.asList("MakananPokok", "MakananPendamping", "Snack").contains(food.getJenis()), "Type of food should be one of MakananPokok, MakananPendamping, or Snack"),
                                    () -> assertEquals(food.getNoIjinPabrik(), food.getNoIjinPabrik(), "Factory license number should be the same")
                            );
                        }
                ));
        return foodObjectStream;
    }

    @TestFactory
    Stream<DynamicTest> dynamicTestsForDrinkObjects() {
        List<Minuman> inputDrinkList = Arrays.asList(
                new Minuman("Minuman1", "Susu", 5, "Suplemen", "P01A"),
                new Minuman("Minuman2", "AirMineral", 0, "AirBersih", "P01B"),
                new Minuman("Minuman3", "Jus Jeruk", 8, "Buah", "P01C")
        );

        Stream<DynamicTest> drinkObjectStream = inputDrinkList.stream()
                .map(drink -> DynamicTest.dynamicTest(
                        "Test drink object: " + drink.getKode(),
                        () -> {
                            assertAll("Grouped assertions of drink",
                                    () -> assertEquals(drink.getKode(), drink.getKode(), "Code of drink should be the same"),
                                    () -> assertEquals(drink.getNama(), drink.getNama(), "Name of drink should be the same"),
                                    () -> assertEquals(drink.getKandunganGula(), drink.getKandunganGula(), "Sugar content should be the same"),
                                    () -> assertTrue(Arrays.asList("AirBersih", "Suplemen", "Buah").contains(drink.getJenis()), "Type of drink should be one of AirBersih, Suplemen, or Buah"),
                                    () -> assertEquals(drink.getJenis(), drink.getJenis(), "Type of drink should be the same"),
                                    () -> assertEquals(drink.getNoIjinPabrik(), drink.getNoIjinPabrik(), "Factory license number should be the same")
                            );
                        }
                ));
        return drinkObjectStream;
    }

    @TestFactory
    Stream<DynamicTest> dynamicTestsForMedicineObjects() {
        List<Obat> inputMedicineList = Arrays.asList(
                new Obat("Obat1", "Decolgen", "Umum", 3, "Tablet", "Pilek", "P01A"),
                new Obat("Obat2", "Paracetamol", "Umum", 2, "Tablet", "Sakit Kepala", "P01B"),
                new Obat("Obat3", "Amoxilin", "Resep", 1, "Kapsul", "Infeksi Bakteri", "P01C")
        );

        Stream<DynamicTest> medicineObjectStream = inputMedicineList.stream()
                .map(medicine -> DynamicTest.dynamicTest(
                        "Test medicine object: " + medicine.getKode(),
                        () -> {
                            assertAll("Grouped assertions of medicine",
                                    () -> assertEquals(medicine.getKode(), medicine.getKode(), "Code of medicine should be the same"),
                                    () -> assertEquals(medicine.getNama(), medicine.getNama(), "Name of medicine should be the same"),
                                    () -> assertEquals(medicine.getJenis(), medicine.getJenis(), "Type of medicine should be the same"),
                                    () -> assertTrue(Arrays.asList(1, 2, 3).contains(medicine.getDosisPerHari()), "Dose per day should be between 1 to 3"),
                                    () -> assertEquals(medicine.getDosisPerHari(), medicine.getDosisPerHari(), "Dose per day should be the same"),
                                    () -> assertEquals(medicine.getBentuk(), medicine.getBentuk(), "Form of medicine should be the same"),
                                    () -> assertEquals(medicine.getPenyakit(), medicine.getPenyakit(), "Disease should be the same"),
                                    () -> assertEquals(medicine.getNoIjinPabrik(), medicine.getNoIjinPabrik(), "Factory license number should be the same")
                            );
                        }
                ));
        return medicineObjectStream;
    }
}
