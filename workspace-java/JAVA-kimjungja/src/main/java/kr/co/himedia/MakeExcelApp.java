package kr.co.himedia;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MakeExcelApp {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        List<MemberDTO> members = new ArrayList<>();

        while (true) {
            System.out.print("이름을 입력하세요 : ");
            String name = scn.nextLine();

            if(name.equals("quit")) {
                break;
            }

            System.out.print("나이를 입력하세요 : ");
            String age = scn.nextLine();

            System.out.print("생년월일을 입력하세요 : ");
            String birthday = scn.nextLine();

            System.out.print("전화번호를 입력하세요 : ");
            String phone = scn.nextLine();

            System.out.print("주소를 입력하세요 : ");
            String address = scn.nextLine();

            System.out.print("결혼여부를 입력하세요 (true/false) : ");
            boolean marriage = scn.nextBoolean();

            // 개행문자 제거
            scn.nextLine();

            MemberDTO memberDTO = new MemberDTO(name, age, birthday, phone, address, marriage);
            members.add(memberDTO);
        }

        scn.close();

        XSSFWorkbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("회원정보");

        // 해더 생성
        Row headerRow = sheet.createRow(0);
        headerRow.createCell(0).setCellValue("이름");
        headerRow.createCell(1).setCellValue("나이");
        headerRow.createCell(2).setCellValue("생년월일");
        headerRow.createCell(3).setCellValue("전화번호");
        headerRow.createCell(4).setCellValue("주소");
        headerRow.createCell(5).setCellValue("결혼여부");

        //데이터 생성
        for(int i = 0; i< members.size(); i++){
            MemberDTO memberDTO = members.get(i);
            Row row = sheet.createRow(i+1);
            row.createCell(0).setCellValue(memberDTO.getName());
            row.createCell(1).setCellValue(memberDTO.getAge());
            row.createCell(2).setCellValue(memberDTO.getBirthday());
            row.createCell(3).setCellValue(memberDTO.getPhone());
            row.createCell(4).setCellValue(memberDTO.getAddress());
            row.createCell(5).setCellValue(memberDTO.isMarriage());
        }

        String filename = "MakeExcelApp.xlsx";
        try {
            FileOutputStream fos = new FileOutputStream(new File(filename));
            workbook.write(fos);
            workbook.close();
            System.out.println("엑셀 파일이 저장되었습니다. : " + filename);
        } catch (IOException e) {
            System.out.println("엑셀 파일 저장 중 오류가 발생했습니다.");
            throw new RuntimeException(e);
        }
    }
}
