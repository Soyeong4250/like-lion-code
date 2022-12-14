package com.line.parser;

import com.line.domain.Hospital;

import java.util.Arrays;

public class HospitalParser implements Parser<Hospital>{
    // 4. 6번 과정을 위해 Hospital 객체를 생성
    // 6. Parser<T> 를 구현하되, T는 Hospital 객체로 지정
    // 인터페이스를 구현한 클래스는 반드시 메서드를 재정의해야하므로 parse()메서드를 필요에 맞게 구현하자
    @Override
    public Hospital parse(String str) {
//        String str = "\\\"A1120837\\\",\\\"서울특별시 금천구 벚꽃로 286 삼성리더스타워 111~114호 (가산동)\\\",\\\"C\\\",\\\"의원\\\",\\\"G099\\\",\\\"응급의료기관 이외\\\",\\\"2\\\",\\\"외과: 상시진료 내과는 당분간 휴진\\\",\\\"서울시 송파구 문정동 장지동 법조단지 위례 가락동 가락시장역 위치 삼성서울병원 외래교수 출신 구강외과 전문의 진료 진료과목 - 임플란트 치조골 뼈이식 수술 매복 사랑니 발치 턱관절 악관절 질환의 치료 교정 치료 및 기타 보존 보철(크라운 브릿지 인레이) 신경치료\\\",\\\"방이역 1번출구 바로옆 굿모닝 신한증권 뒷건물\\\",\\\"가산기대찬의원\\\",\\\"02-6267-2580\\\",\\\"02-920-5374\\\",\\\"1930\\\",\\\"1930\\\",\\\"1930\\\",\\\"1930\\\",\\\"1930\\\",\\\"1500\\\",\\\"1500\\\",\\\"1500\\\",\\\"0900\\\",\\\"0900\\\",\\\"0900\\\",\\\"0900\\\",\\\"0900\\\",\\\"0900\\\",\\\"1000\\\",\\\"1000\\\",\\\"085\\\",\\\"11\\\",\\\"126.88412249700781\\\",\\\"37.4803938036867\\\",\\\"2022-04-07 14:55:00.0\\\"\"";

        str = str.replaceAll("\"", "");
        String[] splitted = str.split(",");
        // 7. Hospital 생성자에 넘겨주는 멤버변수 수정할 것 생각하고 👇 작성 👉 Hospital 클래스로 이동
        return new Hospital(splitted[0], splitted[1], splitted[2], Integer.parseInt(splitted[6]), splitted[10]);  // 병원 데이터 넘겨주기
    }

    /*public String getDistrict(String address){
        String[] splitAddress=address.split(" ");
        return splitAddress[0]+' '+splitAddress[1];
    }
    public String getSubdivision(String name){
        String result="";
        String[] subdivisions={"치과", "소아과", "이비인후과", "피부과", "내과", "성형외과", "외과", "산부인과", "안과", "비뇨기과", "가정", "한의원", "한방"};
        for(String subdividison: subdivisions){
            if (name.contains(subdividison)){
                result=subdividison;
            }
        }
        return result;
    }*/
}
