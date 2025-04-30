package com.RealMyTest;

public class RegisterInfo {

    private String name;
    private int birthYear;
    private int birthMonth;
    private int birthDay;
    private String id;
    private String password;

    public RegisterInfo(String name) {
        this.name = name;
    }

    public RegisterInfo(String name, int birthYear) {
        this(name);
        this.birthYear = birthYear;
    }

    public RegisterInfo(String name, int birthYear, int birthMonth) {
        this(name, birthYear);
        this.birthMonth = birthMonth;
    }

    public RegisterInfo(String name, int birthYear, int birthMonth, int birthDay) {
        this(name, birthYear, birthMonth);
        this.birthDay = birthDay;
    }

    public RegisterInfo(String name, int birthYear, int birthMonth, int birthDay, String id) {
        this(name, birthYear, birthMonth, birthDay);
        this.id = id;
    }

    public RegisterInfo(String name, int birthYear, int birthMonth, int birthDay, String id, String password) {
        this(name, birthYear, birthMonth, birthDay, id);
        this.password = password;
    }

    // getter 구문
    public String getName() {
        return this.name;
    }

    public int getBirthYear() {
        return this.birthYear;
    }

    public int getBirthMonth() {
        return this.birthMonth;
    }

    public int getBirthDay() {
        return this.birthDay;
    }

    public String getId() {
        return this.id;
    }

    public String getPassword() {
        return this.password;
    }

    // setter
    public void setName(String name) {
        while (true) {
            if (name != null) {
                this.name = name;
                System.out.println(name + "라는 이름이 제대로 기입됐습니다!");
                System.out.println("홈페이지로 돌아갑니다.");
                break;
            } else {
                System.out.println("이름이 존재하지 않게 됐습니다!");
                break;
            }
        }
    }

    public void setBirthYear(int birthYear) {
        if (birthYear >= 1920) {
            this.birthYear = birthYear;
            System.out.println(birthYear + "라는 숫자가 제대로 기입됐습니다!");
        } else {
            System.out.println("태어난 연도가 0으로 입력됩니다!");
        }
    }

    public void setBirthMonth(int birthMonth) {
        if ((birthMonth >= 1) && (birthMonth <= 12)) {
            this.birthMonth = birthMonth;
            System.out.println(birthMonth + "라는 숫자가 제대로 기입됐습니다!");
        } else {
            System.out.println("태어난 달이 0으로 입력됩니다!");
        }
    }

    public void setBirthDay(int birthDay) {
        if ((birthDay >= 1) && (birthMonth <= 31)) {
            this.birthDay = birthDay;
            System.out.println(birthDay + "라는 숫자가 제대로 기입됐습니다!");
            System.out.println("홈페이지로 돌아갑니다.");
        } else {
            System.out.println("태어난 일이 0으로 입력됩니다!");
        }
    }

    public void setId(String id) {
        if (id != null) {
            this.id = id;
            System.out.println(id + "라는 아이디가 제대로 기입됐습니다!");
            System.out.println("홈페이지로 돌아갑니다.");
        } else {
            System.out.println("아이디 값이 존재하지 않게 됐습니다!");
        }
    }

    public void setPassword(String password) {
        if (password != null) {
            this.password = password;
            System.out.println(password + "라는 비밀번호가 제대로 기입됐습니다!");
            System.out.println("홈페이지로 돌아갑니다.");
        } else {
            System.out.println("비밀번호 값이 존재하지 않게 됐습니다!");
        }
    }

    public void showInfo() {
        System.out.println("--------- [ " + name + " ] 님의 개인 정보 ---------");
        System.out.println("생년월일: " + birthYear + "/" + birthMonth + "/" + birthDay);
        System.out.println("ID: " + id);
        System.out.println("PW: " + password);
    }


}
