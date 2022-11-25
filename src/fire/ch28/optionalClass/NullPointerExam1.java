package src.fire.ch28.optionalClass;

/* null 가능성에 대비하는 코드의 작성 */
class NullPointerExam1 {
    public static void main(String[] args) {
        ContInfo ci = new ContInfo("321-444-577", "Republic of Korea");
        Company cp = new Company("자취 컴퍼니", ci);
        Friend frn = new Friend("wuga", cp);
        showCompAddress(frn); // 친구가 다니는 회사의 주소 출력
    }

    public static void showCompAddress(Friend f) { // 친구가 다니는 회사 주소 출력
        String address = null;

        if (f != null) { // 인자로 전달된 것이 null 일 수도 있으니
            Company com = f.getCmp();
            if (com != null) { // 회사 정보가 없을 수도 있으니
                ContInfo info = com.getCInfo();
                if (info != null) { // 회사 연락처 정보가 없을 수도 있으니
                    address = info.getAddress();
                }
            }
        }

        if (address != null) { // 주소 정보를 얻지 못할수도 있으니
            System.out.println(address);
        } else {
            System.out.println("회사 주소 정보가 없습니다.");
        }
    }

    static class Friend { // 친구 정보
        String name; // 친구 이름
        Company cmp; // 친구 회사 (null일수 있음)

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
        String cName; // 회사 이름
        ContInfo cInfo; // 회사 정보 (null 일수 있음)

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
        String phone; // 회사 번호 (null 일수 있음)
        String address; // 회사 주소 (null 일수 있음)

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
