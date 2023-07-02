package io.codelex.collections.practice.phonebook;

public class PhoneDirectoryTest {
    public static void main(String[] args) {
        PhoneDirectory phoneDirectory = new PhoneDirectory();

        phoneDirectory.putNumber("Pēteris", "123456");
        phoneDirectory.putNumber("Jānis", "111515516");
        phoneDirectory.putNumber("Ilze", "2424234");

        PhoneEntry entry = new PhoneEntry();
        entry.name = "Ieva";
        entry.number = "222222";

        phoneDirectory.putNumber(entry.name, entry.number);

        System.out.println(phoneDirectory.getNumber("Ieva").equals("222222"));
        System.out.println(phoneDirectory.getNumber("Jānis").equals("111515516"));
        System.out.println(phoneDirectory.getNumber("Pēteris").equals("111111"));

    }
}
