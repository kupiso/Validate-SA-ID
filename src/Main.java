import java.util.Scanner;

interface Functions{
    int birthYear(String idNum);
    int birthDate(String idNum);
    String birthMonth(String idNum);
    String genderID(String idNum);
    String citizenship(String idNum);
    String idValidation(String idNum);
    String printDetails(String idNum);
}
class IDNum implements Functions{
    public int birthYear(String idNum){
        int year = Integer.valueOf(idNum.substring(0,2));
        int checksum = Integer.valueOf("20" + idNum.substring(0,2));
        if( checksum >= 2000 && checksum < 2025){
            return year + 2000;
        }
        else if (year <= 99 && year >= 0) {
            return year + 1900;
        }
        return 0;
    }
    public int birthDate(String idNum){
        int newDate = Integer.valueOf(idNum.substring(4, 6));
        return newDate;
    }
    public String birthMonth(String idNum){
        String month = idNum.substring(2, 4);
        switch (month){
            case "01": return "January";
            case "02": return "February";
            case "03": return "March";
            case "04": return "April";
            case "05": return "May";
            case "06": return "June";
            case "07": return "July";
            case "08": return "August";
            case "09": return "September";
            case "10": return "October";
            case "11": return "November";
            case "12": return "December";
            default: return "Month not found";
        }
    }
    public String genderID(String idNum){
        int checksum = Integer.valueOf(idNum.substring(6, 10));
        if (checksum >= 5000){
            return "Male";
        }
        return "Female";
    }
    public String citizenship(String idNum){
        int checksum = Integer.valueOf(idNum.substring(10, 11));
        if (checksum == 0){
            return "SA Citizen";
        }
        else if(checksum == 1){
            return "Permanent Resident";
        }
        else return "Foreigner";
    }
    public String idValidation(String idNum){
        int checksum = Integer.valueOf(idNum.substring(12, 13));
        if(checksum >= 0 && checksum <= 9){
            return "Valid SA ID Number";
        }
        else {
            return "Invalid SA ID Number";
        }
    }
    public String printDetails(String idNum) {
        return
                        birthDate(idNum) + " " +
                        birthMonth(idNum) + " " +
                        birthYear(idNum) + ", " +
                        genderID(idNum) + ", " +
                        citizenship(idNum) + ", " +
                        idValidation(idNum);
    }
}
class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        IDNum identityNum = new IDNum();
        boolean isValidInput = false;
            while (!isValidInput){
                System.out.print("Enter Your SA ID Number: ");
                try {
                    String idNum = scan.next();
                    if (idNum.length() == 13){
                        System.out.println(identityNum.printDetails(idNum));
                        isValidInput = !false;
                    }
                    else{
                        System.out.println("Invalid ID Number, Please enter a 13 digit ID");
                    }
                }
                catch (Exception e){
                    System.out.println("Invalid Input");
                    scan.nextLine();
                }
            }
        scan.close();
    }
}
