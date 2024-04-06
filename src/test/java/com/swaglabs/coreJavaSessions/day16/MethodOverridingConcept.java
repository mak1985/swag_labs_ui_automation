package day16;

 class RbiBank {

    double getRateOfInterest() {
        return 0.0;
    }

}

class HdfcBank extends RbiBank {
    double getRateOfInterest() {
        return 9.3;
    }
}

class IciciBank extends RbiBank {

    double getRateOfInterest(){
        return 9.1;
    }
}

class SbiBank extends RbiBank {

    double getRateOfInterest() {
        return 8.9;
    }
}



public class MethodOverridingConcept {

    public static void main(String[] args) {
        HdfcBank hdfc = new HdfcBank();
        System.out.println("HDFC Bank ROI: " +hdfc.getRateOfInterest()+ "%"); //9.3

        IciciBank icici = new IciciBank();
        System.out.println("IciciBank ROI: " +icici.getRateOfInterest()+ "%");

        SbiBank sbi = new SbiBank();
        System.out.println("SbiBank ROI: " +sbi.getRateOfInterest()+ "%");

    }
}
