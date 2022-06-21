package application.entities;


public class OutsourceEmployee extends Employee {

    private static final double TAX_ADDITIONAL_CHARGE = 1.1; 

    private Double additionalCharge;

    public OutsourceEmployee(String name,Integer hours,Double valuePerHour,  Double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    public Double getAdditionalCharge() {
        return this.additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }


    @Override
    public double payment(){
        return super.payment() + this.additionalCharge * TAX_ADDITIONAL_CHARGE;
    }

}
