package src.fire.ch09;

/* 캡슐화 */
public class Cap {
    public static void main(String[] args) {
        ColdPatient patient = new ColdPatient(); // 환자 생성
        patient.coldTakeList(new ColdCap());
    }

    static class ColdCap {
        // 콧물 처치
        void snot() {
            System.out.println("콧물이 싹~ 납니다.");
        }

        // 재채기 처치
        void sneeze() {
            System.out.println("재채기가 멎습니다.");
        }

        // 코 막힘 처치
        void snuffle() {
            System.out.println("코가 뻥 뚫립니다.");
        }

        // 약의 복용 방법 및 순서가 담긴 메소드
        void coldTake() {
            snot();
            sneeze();
            snuffle();
        }
    }

    static class ColdPatient {
        void coldTakeList(ColdCap cap) {
            cap.coldTake();
        }
    }
}
