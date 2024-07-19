package src.fire.ch28.optionalClass;

import java.util.Optional;

class NullPointerExam3 {
    public static void main(String[] args) {
        Optional<ContInfo> ci = Optional.of(new ContInfo(Optional.ofNullable(null), Optional.of("Republic of Korea")));
        Optional<Company> cp = Optional.of(new Company("자취 컴퍼니", ci));
        Optional<Friend> frn = Optional.of(new Friend("wuga", cp));
        showCompAddress(frn);
    }

    public static void showCompAddress(Optional<Friend> f) {
        String address = f.flatMap(Friend::getCmp)
                .flatMap(Company::getCInfo)
                .flatMap(ContInfo::getAddress)
                .orElse("주소 정보가 없습니다.");
        System.out.println(address);
    }

    static class Friend { // 친구 정보
        String name;
        Optional<Company> cmp; // null 일수 있음

        public Friend(String n, Optional<Company> c) {
            name = n;
            cmp = c;
        }

        public String getName() {
            return name;
        }

        public Optional<Company> getCmp() {
            return cmp;
        }
    }

    static class Company { // 친구 정보에 속하는 회사 정보
        String cName;
        Optional<ContInfo> cInfo; // null 일수 있음

        public Company(String cn, Optional<ContInfo> ci) {
            cName = cn;
            cInfo = ci;
        }

        public String getCName() {
            return cName;
        }

        public Optional<ContInfo> getCInfo() {
            return cInfo;
        }
    }

    static class ContInfo { // 회사 정보에 속하는 회사 연락처
        Optional<String> phone; // null 일수 있음
        Optional<String> address; // null 일수 있음

        public ContInfo(Optional<String> ph, Optional<String> ad) {
            phone = ph;
            address = ad;
        }

        public Optional<String> getPhone() {
            return phone;
        }

        public Optional<String> getAddress() {
            return address;
        }
    }

}
