package tec.uom.client.fitbit.model.foods;

import javax.measure.Quantity;
import javax.measure.quantity.Energy;
import javax.measure.quantity.Mass;

/**
 * User: Anakar Parida
 * Date: May 6, 2015
 * Time: 2:53:29 PM
 */
public class NutritionalValuesEntry {
    private Quantity<Energy> calories;
    private Quantity<Energy> caloriesFromFat;
    private Quantity<Mass> totalFat;
    private Quantity<Mass> saturatedFat;
    private Quantity<Mass> transFat;
    private Quantity<Mass> cholesterol;
    private Quantity<Mass> sodium;
    private Quantity<Mass> totalCarbohydrate;
    private Quantity<Mass> dietaryFiber;
    private Quantity<Mass> sugars;
    private Quantity<Mass> protein;
    private Quantity<Mass> vitaminA;
    private Quantity<Mass> vitaminC;
    private Quantity<Mass> iron;
    private Quantity<Mass> calcium;
    private Quantity<Mass> potassium;
    private Quantity<Mass> thiamin;
    private Quantity<Mass> riboflavin;
    private Quantity<Mass> niacin;
    private Quantity<Mass> vitaminD;
    private Quantity<Mass> vitaminE;
    private Quantity<Mass> vitaminB6;
    private Quantity<Mass> folicAcid;
    private Quantity<Mass> vitaminB12;
    private Quantity<Mass> phosphorus;
    private Quantity<Mass> iodine;
    private Quantity<Mass> magnesium;
    private Quantity<Mass> zinc;
    private Quantity<Mass> copper;
    private Quantity<Mass> biotin;
    private Quantity<Mass> pantothenicAcid;

    public NutritionalValuesEntry() {
    }

    

    public NutritionalValuesEntry(Quantity<Energy> calories,
			Quantity<Energy> caloriesFromFat, Quantity<Mass> totalFat,
			Quantity<Mass> saturatedFat, Quantity<Mass> transFat,
			Quantity<Mass> cholesterol, Quantity<Mass> sodium,
			Quantity<Mass> totalCarbohydrate, Quantity<Mass> dietaryFiber,
			Quantity<Mass> sugars, Quantity<Mass> protein,
			Quantity<Mass> vitaminA, Quantity<Mass> vitaminC,
			Quantity<Mass> iron, Quantity<Mass> calcium,
			Quantity<Mass> potassium, Quantity<Mass> thiamin,
			Quantity<Mass> riboflavin, Quantity<Mass> niacin,
			Quantity<Mass> vitaminD, Quantity<Mass> vitaminE,
			Quantity<Mass> vitaminB6, Quantity<Mass> folicAcid,
			Quantity<Mass> vitaminB12, Quantity<Mass> phosphorus,
			Quantity<Mass> iodine, Quantity<Mass> magnesium,
			Quantity<Mass> zinc, Quantity<Mass> copper, Quantity<Mass> biotin,
			Quantity<Mass> pantothenicAcid) {
		this.calories = calories;
		this.caloriesFromFat = caloriesFromFat;
		this.totalFat = totalFat;
		this.saturatedFat = saturatedFat;
		this.transFat = transFat;
		this.cholesterol = cholesterol;
		this.sodium = sodium;
		this.totalCarbohydrate = totalCarbohydrate;
		this.dietaryFiber = dietaryFiber;
		this.sugars = sugars;
		this.protein = protein;
		this.vitaminA = vitaminA;
		this.vitaminC = vitaminC;
		this.iron = iron;
		this.calcium = calcium;
		this.potassium = potassium;
		this.thiamin = thiamin;
		this.riboflavin = riboflavin;
		this.niacin = niacin;
		this.vitaminD = vitaminD;
		this.vitaminE = vitaminE;
		this.vitaminB6 = vitaminB6;
		this.folicAcid = folicAcid;
		this.vitaminB12 = vitaminB12;
		this.phosphorus = phosphorus;
		this.iodine = iodine;
		this.magnesium = magnesium;
		this.zinc = zinc;
		this.copper = copper;
		this.biotin = biotin;
		this.pantothenicAcid = pantothenicAcid;
	}



	public Quantity<Energy> getCalories() {
        return calories;
    }

    public void setCalories(Quantity<Energy> calories) {
        this.calories = calories;
    }

    public Quantity<Energy> getCaloriesFromFat() {
        return caloriesFromFat;
    }

    public void setCaloriesFromFat(Quantity<Energy> caloriesFromFat) {
        this.caloriesFromFat = caloriesFromFat;
    }

    public Quantity<Mass> getTotalFat() {
        return totalFat;
    }

    public void setTotalFat(Quantity<Mass> totalFat) {
        this.totalFat = totalFat;
    }

    public Quantity<Mass> getSaturatedFat() {
        return saturatedFat;
    }

    public void setSaturatedFat(Quantity<Mass> saturatedFat) {
        this.saturatedFat = saturatedFat;
    }

    public Quantity<Mass> getTransFat() {
        return transFat;
    }

    public void setTransFat(Quantity<Mass> transFat) {
        this.transFat = transFat;
    }

    public Quantity<Mass> getCholesterol() {
        return cholesterol;
    }

    public void setCholesterol(Quantity<Mass> cholesterol) {
        this.cholesterol = cholesterol;
    }

    public Quantity<Mass> getSodium() {
        return sodium;
    }

    public void setSodium(Quantity<Mass> sodium) {
        this.sodium = sodium;
    }

    public Quantity<Mass> getTotalCarbohydrate() {
        return totalCarbohydrate;
    }

    public void setTotalCarbohydrate(Quantity<Mass> totalCarbohydrate) {
        this.totalCarbohydrate = totalCarbohydrate;
    }

    public Quantity<Mass> getDietaryFiber() {
        return dietaryFiber;
    }

    public void setDietaryFiber(Quantity<Mass> dietaryFiber) {
        this.dietaryFiber = dietaryFiber;
    }

    public Quantity<Mass> getSugars() {
        return sugars;
    }

    public void setSugars(Quantity<Mass> sugars) {
        this.sugars = sugars;
    }

    public Quantity<Mass> getProtein() {
        return protein;
    }

    public void setProtein(Quantity<Mass> protein) {
        this.protein = protein;
    }

    public Quantity<Mass> getVitaminA() {
        return vitaminA;
    }

    public void setVitaminA(Quantity<Mass> vitaminA) {
        this.vitaminA = vitaminA;
    }

    public Quantity<Mass> getVitaminC() {
        return vitaminC;
    }

    public void setVitaminC(Quantity<Mass> vitaminC) {
        this.vitaminC = vitaminC;
    }

    public Quantity<Mass> getIron() {
        return iron;
    }

    public void setIron(Quantity<Mass> iron) {
        this.iron = iron;
    }

    public Quantity<Mass> getCalcium() {
        return calcium;
    }

    public void setCalcium(Quantity<Mass> calcium) {
        this.calcium = calcium;
    }

    public Quantity<Mass> getPotassium() {
        return potassium;
    }

    public void setPotassium(Quantity<Mass> potassium) {
        this.potassium = potassium;
    }

    public Quantity<Mass> getThiamin() {
        return thiamin;
    }

    public void setThiamin(Quantity<Mass> thiamin) {
        this.thiamin = thiamin;
    }

    public Quantity<Mass> getRiboflavin() {
        return riboflavin;
    }

    public void setRiboflavin(Quantity<Mass> riboflavin) {
        this.riboflavin = riboflavin;
    }

    public Quantity<Mass> getNiacin() {
        return niacin;
    }

    public void setNiacin(Quantity<Mass> niacin) {
        this.niacin = niacin;
    }

    public Quantity<Mass> getVitaminD() {
        return vitaminD;
    }

    public void setVitaminD(Quantity<Mass> vitaminD) {
        this.vitaminD = vitaminD;
    }

    public Quantity<Mass> getVitaminE() {
        return vitaminE;
    }

    public void setVitaminE(Quantity<Mass> vitaminE) {
        this.vitaminE = vitaminE;
    }

    public Quantity<Mass> getVitaminB6() {
        return vitaminB6;
    }

    public void setVitaminB6(Quantity<Mass> vitaminB6) {
        this.vitaminB6 = vitaminB6;
    }

    public Quantity<Mass> getFolicAcid() {
        return folicAcid;
    }

    public void setFolicAcid(Quantity<Mass> folicAcid) {
        this.folicAcid = folicAcid;
    }

    public Quantity<Mass> getVitaminB12() {
        return vitaminB12;
    }

    public void setVitaminB12(Quantity<Mass> vitaminB12) {
        this.vitaminB12 = vitaminB12;
    }

    public Quantity<Mass> getPhosphorus() {
        return phosphorus;
    }

    public void setPhosphorus(Quantity<Mass> phosphorus) {
        this.phosphorus = phosphorus;
    }

    public Quantity<Mass> getIodine() {
        return iodine;
    }

    public void setIodine(Quantity<Mass> iodine) {
        this.iodine = iodine;
    }

    public Quantity<Mass> getMagnesium() {
        return magnesium;
    }

    public void setMagnesium(Quantity<Mass> magnesium) {
        this.magnesium = magnesium;
    }

    public Quantity<Mass> getZinc() {
        return zinc;
    }

    public void setZinc(Quantity<Mass> zinc) {
        this.zinc = zinc;
    }

    public Quantity<Mass> getCopper() {
        return copper;
    }

    public void setCopper(Quantity<Mass> copper) {
        this.copper = copper;
    }

    public Quantity<Mass> getBiotin() {
        return biotin;
    }

    public void setBiotin(Quantity<Mass> biotin) {
        this.biotin = biotin;
    }

    public Quantity<Mass> getPantothenicAcid() {
        return pantothenicAcid;
    }

    public void setPantothenicAcid(Quantity<Mass> pantothenicAcid) {
        this.pantothenicAcid = pantothenicAcid;
    }

}
