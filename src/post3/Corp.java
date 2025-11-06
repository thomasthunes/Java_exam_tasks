package post3;

import java.util.Arrays;

public enum Corp {
    CFO("A"), CMO("B"), CTO("D");
    private final String name;
    Corp(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Arrays.stream(Corp.values()).filter(c -> c.equals(Corp.CFO));
        switch (Corp.CMO) {
            case CFO -> System.out.println("Finance");
            case CMO -> System.out.println("Marketing");
            case CTO -> System.out.println("Technology");
        }
    }
}
