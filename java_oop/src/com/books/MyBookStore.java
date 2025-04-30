package com.books;


import java.util.Scanner;

/**
 * 모든 프로그래밍의 기본은 CRUD이다
 */

public class MyBookStore {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //배열 준비
        int maxBookShelfSize = 1;

        Book[] books = new Book[(maxBookShelfSize * 100)];
//        books = null; // 삭제 방법
        boolean flag = true;

        // TODO - 추후 삭제하기
        // 샘플 데이터 만들어두기
//        books[0] = new Book("타이틀1", "저자1");
//        books[1] = new Book("타이틀2", "저자2");
//        books[2] = new Book("타이틀3", "저자3");
//        books[3] = new Book("타이틀4", "저자4");
//        books[4] = new Book("타이틀5", "저자5");
//        books[5] = new Book("타이틀6", "저자6");
//        books[6] = new Book("타이틀7", "저자7");
//        books[7] = new Book("타이틀8", "저자8");
//        books[8] = new Book("타이틀9", "저자9");
//        books[9] = new Book("타이틀10", "저자10");
//        books[10] = new Book("타이틀11", "저자11");
//        books[11] = new Book("타이틀12", "저자12");
//        books[12] = new Book("타이틀13", "저자13");
//        books[13] = new Book("타이틀14", "저자14");
//        books[14] = new Book("타이틀15", "저자15");
//        books[15] = new Book("타이틀16", "저자16");
//        books[16] = new Book("타이틀17", "저자17");
//        books[17] = new Book("타이틀18", "저자18");
//        books[18] = new Book("타이틀19", "저자19");
//        books[19] = new Book("타이틀20", "저자20");
//        books[20] = new Book("타이틀21", "저자21");
//        books[21] = new Book("타이틀22", "저자22");
//        books[22] = new Book("타이틀23", "저자23");
//        books[23] = new Book("타이틀24", "저자24");
//        books[24] = new Book("타이틀25", "저자25");
//        books[25] = new Book("타이틀26", "저자26");
//        books[26] = new Book("타이틀27", "저자27");
//        books[27] = new Book("타이틀28", "저자28");
//        books[28] = new Book("타이틀29", "저자29");
//        books[29] = new Book("타이틀30", "저자30");
//        books[30] = new Book("타이틀31", "저자31");
//        books[31] = new Book("타이틀32", "저자32");
//        books[32] = new Book("타이틀33", "저자33");
//        books[33] = new Book("타이틀34", "저자34");
//        books[34] = new Book("타이틀35", "저자35");
//        books[35] = new Book("타이틀36", "저자36");
//        books[36] = new Book("타이틀37", "저자37");
//        books[37] = new Book("타이틀38", "저자38");
//        books[38] = new Book("타이틀39", "저자39");
//        books[39] = new Book("타이틀40", "저자40");
//        books[40] = new Book("타이틀41", "저자41");
//        books[41] = new Book("타이틀42", "저자42");
//        books[42] = new Book("타이틀43", "저자43");
//        books[43] = new Book("타이틀44", "저자44");
//        books[44] = new Book("타이틀45", "저자45");
//        books[45] = new Book("타이틀46", "저자46");
//        books[46] = new Book("타이틀47", "저자47");
//        books[47] = new Book("타이틀48", "저자48");
//        books[48] = new Book("타이틀49", "저자49");
//        books[49] = new Book("타이틀50", "저자50");
//        books[50] = new Book("타이틀51", "저자51");
//        books[51] = new Book("타이틀52", "저자52");
//        books[52] = new Book("타이틀53", "저자53");
//        books[53] = new Book("타이틀54", "저자54");
//        books[54] = new Book("타이틀55", "저자55");
//        books[55] = new Book("타이틀56", "저자56");
//        books[56] = new Book("타이틀57", "저자57");
//        books[57] = new Book("타이틀58", "저자58");
//        books[58] = new Book("타이틀59", "저자59");
//        books[59] = new Book("타이틀60", "저자60");
//        books[60] = new Book("타이틀61", "저자61");
//        books[61] = new Book("타이틀62", "저자62");
//        books[62] = new Book("타이틀63", "저자63");
//        books[63] = new Book("타이틀64", "저자64");
//        books[64] = new Book("타이틀65", "저자65");
//        books[65] = new Book("타이틀66", "저자66");
//        books[66] = new Book("타이틀67", "저자67");
//        books[67] = new Book("타이틀68", "저자68");
//        books[68] = new Book("타이틀69", "저자69");
//        books[69] = new Book("타이틀70", "저자70");
//        books[70] = new Book("타이틀71", "저자71");
//        books[71] = new Book("타이틀72", "저자72");
//        books[72] = new Book("타이틀73", "저자73");
//        books[73] = new Book("타이틀74", "저자74");
//        books[74] = new Book("타이틀75", "저자75");
//        books[75] = new Book("타이틀76", "저자76");
//        books[76] = new Book("타이틀77", "저자77");
//        books[77] = new Book("타이틀78", "저자78");
//        books[78] = new Book("타이틀79", "저자79");
//        books[79] = new Book("타이틀80", "저자80");
//        books[80] = new Book("타이틀81", "저자81");
//        books[81] = new Book("타이틀82", "저자82");
//        books[82] = new Book("타이틀83", "저자83");
//        books[83] = new Book("타이틀84", "저자84");
//        books[84] = new Book("타이틀85", "저자85");
//        books[85] = new Book("타이틀86", "저자86");
//        books[86] = new Book("타이틀87", "저자87");
//        books[87] = new Book("타이틀88", "저자88");
//        books[88] = new Book("타이틀89", "저자89");
//        books[89] = new Book("타이틀90", "저자90");
//        books[90] = new Book("타이틀91", "저자91");
//        books[91] = new Book("타이틀92", "저자92");
//        books[92] = new Book("타이틀93", "저자93");
//        books[93] = new Book("타이틀94", "저자94");
//        books[94] = new Book("타이틀95", "저자95");
//        books[95] = new Book("타이틀96", "저자96");
//        books[96] = new Book("타이틀97", "저자97");
//        books[97] = new Book("타이틀98", "저자98");
//        books[98] = new Book("타이틀99", "저자99");
//        books[99] = new Book("타이틀100", "저자100");

        final String SAVE = "1";
        final String SEARCH_ALL = "2";
        final String SEARCH_BY_TITLE = "3";
        final String DELETE_ALL = "4";
        final String END = "5";

        while (flag) {
            System.out.println("** 메뉴 선택 **");
            System.out.printf("1. \uD83D\uDCC1 저장 / 2. \uD83D\uDCC4 전체 조회 / 3. \uD83D\uDD0E 선택 조회 / 4. \uD83D\uDDD1 전체 삭제 / 5. \uD83D\uDD1A 프로그램 종료\n입력: ");
            String selectedNumber = scanner.next();

            // 숫자 비교할 때 == 사용
            // 문자열 비교할 때는 "문자열".euqals("문자열") --> 같으면 true, 다르면 false
            // 문자열 비교할 때는 무조건 equals() 메서드를 사용하자
            if (selectedNumber.equals(SAVE)) {
                // 동작
                books = save(scanner, books, selectedNumber, maxBookShelfSize);
                maxBookShelfSize++;
            } else if (selectedNumber.equals(SEARCH_ALL)) {
                // 동작
                readAll(books);

            } else if (selectedNumber.equals(SEARCH_BY_TITLE)) {
                // 동작
                readByTitle(scanner, books);

            } else if (selectedNumber.equals(DELETE_ALL)) {
                // 동작
                deleteAll(books);

            } else if (selectedNumber.equals(END)) {
                System.out.println("프로그램을 종료합니다.");
                break;
                // flag = false; --> while(false)가 되어서 종료
            } else {
                System.out.printf(selectedNumber + "는 잘못된 값입니다! 다시 선택해주세요.\n입력: ");
            }


        }

    }

    // 저장하기
    public static Book[] save(Scanner scanner, Book[] books, String selectedNumber, int maxBookShelfSize) {

        // 책을 추가하기 위한 도구
        int selectShelfNumber = 0;
        int process = 0;

        // 책장이 꽉 찼는지 감지
        boolean isFull = false;

        while (process == 0) {
            // 책장에 책을 넣기 위해 selectShelfNumber라는 책장의 번호 초기화(값 넣기)
            System.out.printf("먼저 책을 어디에다가 넣고 싶은지 인덱스를 선택해주세요.( 0 ~ " + (books.length - 1) + " )\n단, 실제로는 1~" + books.length + " 범위의 칸으로 생각해주세요.\n입력: ");
            selectShelfNumber = scanner.nextInt();

            if ((selectShelfNumber >= 0) && ((selectShelfNumber) <= (books.length - 1)) && (books[selectShelfNumber] == null)) {
                System.out.println((selectShelfNumber + 1) + "번째 칸으로 확인 되었습니다!");
                process++;
                // 책장의 번호가 0 ~ ((maxBookShelfSize + 1) * 100 - 1)이며, 해당되는 번호의 배열이 null값이라면 그대로 넣기.

            } else if ((selectShelfNumber >= 0) && ((selectShelfNumber) <= (books.length - 1)) && (books[selectShelfNumber] != null)) {
                for (int i = 0; ((i <= books.length) && (books[selectShelfNumber] != null)); i++) {
                    if ((i < books.length) && (books[i] == null)) {
                        selectShelfNumber = i;
                        System.out.println("해당 자리는 이미 책이 있었기 때문에 비어있는 " + (selectShelfNumber + 1) + "번째 칸에 차례대로 넣겠습니다.");
                        process++;
                        break;
                        // 해당되는 번호의 배열이 null값이 아니라면, for문으로 처음부터 다시 추적해서 비어있는 책장 찾기
                        // 그리고 process 변수를 추가해서 책을 넣는 동작 활성화 및 break

                    } else if ((i == books.length) && (books[(i - 1)] != null)) {
                        Book[] tempBooks = books;
                        books = new Book[((maxBookShelfSize + 1) * 100)];
                        System.out.println("책장이 가득차서 크기를 " + books.length + "으로 변경했습니다!");

                        for (int check = 0; check < tempBooks.length; check++) {
                            books[check] = new Book(tempBooks[check].getTitle(), tempBooks[check].getAuthor());
                        }

//                            books[100] = new Book("타이틀101", "저자101");
//                            books[101] = new Book("타이틀102", "저자102");
//                            books[102] = new Book("타이틀103", "저자103");
//                            books[103] = new Book("타이틀104", "저자104");
//                            books[104] = new Book("타이틀105", "저자105");
//                            books[105] = new Book("타이틀106", "저자106");
//                            books[106] = new Book("타이틀107", "저자107");
//                            books[107] = new Book("타이틀108", "저자108");
//                            books[108] = new Book("타이틀109", "저자109");
//                            books[109] = new Book("타이틀110", "저자110");
//                            books[110] = new Book("타이틀111", "저자111");
//                            books[111] = new Book("타이틀112", "저자112");
//                            books[112] = new Book("타이틀113", "저자113");
//                            books[113] = new Book("타이틀114", "저자114");
//                            books[114] = new Book("타이틀115", "저자115");
//                            books[115] = new Book("타이틀116", "저자116");
//                            books[116] = new Book("타이틀117", "저자117");
//                            books[117] = new Book("타이틀118", "저자118");
//                            books[118] = new Book("타이틀119", "저자119");
//                            books[119] = new Book("타이틀120", "저자120");
//                            books[120] = new Book("타이틀121", "저자121");
//                            books[121] = new Book("타이틀122", "저자122");
//                            books[122] = new Book("타이틀123", "저자123");
//                            books[123] = new Book("타이틀124", "저자124");
//                            books[124] = new Book("타이틀125", "저자125");
//                            books[125] = new Book("타이틀126", "저자126");
//                            books[126] = new Book("타이틀127", "저자127");
//                            books[127] = new Book("타이틀128", "저자128");
//                            books[128] = new Book("타이틀129", "저자129");
//                            books[129] = new Book("타이틀130", "저자130");
//                            books[130] = new Book("타이틀131", "저자131");
//                            books[131] = new Book("타이틀132", "저자132");
//                            books[132] = new Book("타이틀133", "저자133");
//                            books[133] = new Book("타이틀134", "저자134");
//                            books[134] = new Book("타이틀135", "저자135");
//                            books[135] = new Book("타이틀136", "저자136");
//                            books[136] = new Book("타이틀137", "저자137");
//                            books[137] = new Book("타이틀138", "저자138");
//                            books[138] = new Book("타이틀139", "저자139");
//                            books[139] = new Book("타이틀140", "저자140");
//                            books[140] = new Book("타이틀141", "저자141");
//                            books[141] = new Book("타이틀142", "저자142");
//                            books[142] = new Book("타이틀143", "저자143");
//                            books[143] = new Book("타이틀144", "저자144");
//                            books[144] = new Book("타이틀145", "저자145");
//                            books[145] = new Book("타이틀146", "저자146");
//                            books[146] = new Book("타이틀147", "저자147");
//                            books[147] = new Book("타이틀148", "저자148");
//                            books[148] = new Book("타이틀149", "저자149");
//                            books[149] = new Book("타이틀150", "저자150");
//                            books[150] = new Book("타이틀151", "저자151");
//                            books[151] = new Book("타이틀152", "저자152");
//                            books[152] = new Book("타이틀153", "저자153");
//                            books[153] = new Book("타이틀154", "저자154");
//                            books[154] = new Book("타이틀155", "저자155");
//                            books[155] = new Book("타이틀156", "저자156");
//                            books[156] = new Book("타이틀157", "저자157");
//                            books[157] = new Book("타이틀158", "저자158");
//                            books[158] = new Book("타이틀159", "저자159");
//                            books[159] = new Book("타이틀160", "저자160");
//                            books[160] = new Book("타이틀161", "저자161");
//                            books[161] = new Book("타이틀162", "저자162");
//                            books[162] = new Book("타이틀163", "저자163");
//                            books[163] = new Book("타이틀164", "저자164");
//                            books[164] = new Book("타이틀165", "저자165");
//                            books[165] = new Book("타이틀166", "저자166");
//                            books[166] = new Book("타이틀167", "저자167");
//                            books[167] = new Book("타이틀168", "저자168");
//                            books[168] = new Book("타이틀169", "저자169");
//                            books[169] = new Book("타이틀170", "저자170");
//                            books[170] = new Book("타이틀171", "저자171");
//                            books[171] = new Book("타이틀172", "저자172");
//                            books[172] = new Book("타이틀173", "저자173");
//                            books[173] = new Book("타이틀174", "저자174");
//                            books[174] = new Book("타이틀175", "저자175");
//                            books[175] = new Book("타이틀176", "저자176");
//                            books[176] = new Book("타이틀177", "저자177");
//                            books[177] = new Book("타이틀178", "저자178");
//                            books[178] = new Book("타이틀179", "저자179");
//                            books[179] = new Book("타이틀180", "저자180");
//                            books[180] = new Book("타이틀181", "저자181");
//                            books[181] = new Book("타이틀182", "저자182");
//                            books[182] = new Book("타이틀183", "저자183");
//                            books[183] = new Book("타이틀184", "저자184");
//                            books[184] = new Book("타이틀185", "저자185");
//                            books[185] = new Book("타이틀186", "저자186");
//                            books[186] = new Book("타이틀187", "저자187");
//                            books[187] = new Book("타이틀188", "저자188");
//                            books[188] = new Book("타이틀189", "저자189");
//                            books[189] = new Book("타이틀190", "저자190");
//                            books[190] = new Book("타이틀191", "저자191");
//                            books[191] = new Book("타이틀192", "저자192");
//                            books[192] = new Book("타이틀193", "저자193");
//                            books[193] = new Book("타이틀194", "저자194");
//                            books[194] = new Book("타이틀195", "저자195");
//                            books[195] = new Book("타이틀196", "저자196");
//                            books[196] = new Book("타이틀197", "저자197");
//                            books[197] = new Book("타이틀198", "저자198");
//                            books[198] = new Book("타이틀199", "저자199");

                        break;
                        // for문을 다 돌렸음에도 자리가 없다면 책장 확장하기
                    }
                }
            } else {
                System.out.printf(selectShelfNumber + "는 올바른 값이 아닙니다! 0~" + (books.length - 1) + "의 값을 입력해주세요.\n다시 입력: ");
                // 책장 자리 입력값이 잘못된 경우
            }

        }


        while (process == 1) {
            System.out.println("그 다음은 책의 이름을 입력해주세요.");
            String saveBookTitle = scanner.next();
            // 책의 이름을 넣는 구문

            if (saveBookTitle != null) {
                System.out.println("마지막으로 책의 저자를 입력해주세요.");
                String saveBookAuthor = scanner.next();
                // 만약 책의 타이틀을 제대로 넣었다면 저자를 입력

                if (saveBookAuthor != null) {
                    books[selectShelfNumber] = new Book(saveBookTitle, saveBookAuthor);
                    System.out.println((selectShelfNumber + 1) + "번에 제대로 [제목: " + books[selectShelfNumber].getTitle() + " / 저자: " + books[selectShelfNumber].getAuthor() + "]의 책이 등록되었습니다.");
                    break;
                    // 만약 책의 저자를 제대로 넣었다면 해당하는 책장의 번호로 입력한 책의 타이틀과 저자와 함께 추가하고 break

                }
            }
        }
        return books;
    }

    // 전체 조회하기
    public static void readAll(Book[] books) {
        System.out.println("------- \uD83D\uDD0E 전체 조회 -------");
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                System.out.println((i + 1) + ". \uD83D\uDCD7책 제목: " + books[i].getTitle() + " / ✒\uFE0F저자: " + books[i].getAuthor());
            }
        }
        System.out.println("--------------------------");
    }

    // 책 제목으로 조회하기
    public static void readByTitle(Scanner scanner, Book[] books) {
        System.out.printf("책 제목을 입력해주세요.\n입력: ");
        // 문자열 기능중에 공백제거 기능
        // trim();
        String title = scanner.next();
        boolean isFind = false;
        int sum = 0;

        for (int i = 0; i <= books.length; i++) {
            if ((i == books.length) && (sum > 0)) {
                System.out.println("총 [" + sum + "]권을 발견했습니다!");
                isFind = true;
                break;
                // i가 순환하며 끝까지 도달했을 경우 발견한 책의 갯수(sum)를 출력하고 플래그 변경 및 break
                // 중요한 것은, sum > 0 조건에 의해 아무것도 발견되지 않으면 flag가 false로 유지된다.

            }

            if ((i < books.length) && (books[i] != null)) {
                // 양 끝의 공백을 알아서 지워주는 기능 -> trim();
                if (books[i].getTitle().equals(title.trim())) {
                    System.out.println("번호: " + (i + 1) + " / \uD83D\uDCD7책 제목: " + books[i].getTitle() + " / ✒\uFE0F저자: " + books[i].getAuthor() + "의 책을 찾았습니다!");
                    sum++;
                    // 만약, 해당하는 순번의 배열 값이 null이 아니라면 발견한 책 순번과 타이틀, 그리고 저자를 출력한 뒤 sum++ 해주기
                }
            }
            // 만약 책을 찾지 못했다면
        }
        if ((!isFind) && (sum < 1)) {
            System.out.println("책을 찾지 못했습니다.");
            //
        }

    }

    // 전체 삭제하기
    public static void deleteAll(Book[] books) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                continue;
            } else {
                books[i] = null;
            }
        }
        System.out.println("책을 모두 삭제했습니다!");
    }
}