package src.fire.ch28.optionalClass;

import java.util.Optional;


class NullPointerExam2 {
    public static void main(String[] args) {
        ContInfo ci = new ContInfo("321-444-577", "Republic of Korea");
        Company cp = new Company("자취 컴퍼니", ci);
        Friend frn = new Friend("wuga", cp);
        showCompAddress(Optional.of(frn));
    }

    public static void showCompAddress(Optional<Friend> f) {
        String address = f.map(Friend::getCmp)
                .map(Company::getCInfo)
                .map(ContInfo::getAddress)
                .orElse("주소 정보가 없습니다.");
        System.out.println(address);
    }

    static class Friend { // 친구 정보
        String name;
        Company cmp; // null 일수 있음

        public Friend(String n, Company c) {
            name = n;
            cmp = c;
        }

        public String getName() {
            return name;
        }

        public Company getCmp() {
            return cmp;
        }
    }

    static class Company { // 친구 정보에 속하는 회사 정보
        String cName;
        ContInfo cInfo; // null 일수 있음

        public Company(String cn, ContInfo ci) {
            cName = cn;
            cInfo = ci;
        }

        public String getCName() {
            return cName;
        }

        public ContInfo getCInfo() {
            return cInfo;
        }
    }

    static class ContInfo { // 회사 정보에 속하는 회사 연락처
        String phone; // null 일수 있음
        String address; // null 일수 있음

        public ContInfo(String ph, String ad) {
            phone = ph;
            address = ad;
        }

        public String getPhone() {
            return phone;
        }

        public String getAddress() {
            return address;
        }
    }
}
