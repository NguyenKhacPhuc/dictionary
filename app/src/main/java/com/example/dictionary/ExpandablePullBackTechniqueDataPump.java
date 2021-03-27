package com.example.dictionary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpandablePullBackTechniqueDataPump {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<>();

        List<String> daymem = new ArrayList<>();

        daymem.add("*\tCách 1: Cuộn tròn\n" +
                "Cuộn tròn được áp dụng cho dây dài, chất liệu mềm như: Dây có chất liệu là sợi manila, sisal, cotton.\n");
        daymem.add("Hai chiến sỹ rải dây ra, một chiến sỹ cầm 2 đầu cuộn dây và một chiến sỹ cầm giữa cuộn dây cùng kéo căng cuộn dây, sau khi dây đã được kéo căng không bị xoắn, gấp thì chiến sĩ đứng ở đầu dây tiến hành thao tác cuộn.");
        daymem.add("Chiến sĩ cầm dây lên, gấp đôi dây khoảng (60-70)cm và tạo một nút thắt. Cặp một đoạn dây vào nách, tay trái cầm đầu dây ngắn cuốn từ (3 – 4) vòng vào bàn tay trái làm lõi, tay phải cầm đầu dây dài cuốn xung quanh lõi (3 – 4) vòng từ dưới lên vòng nọ sát vào vòng kia.");
        daymem.add("Sau đó tiếp tục cuộn dây theo đường chéo song song với nhau cho đến khi hết cuộn dây. Khi cuộn dây đã cuộn gần hết, đầu dây còn thừa giấu xuống dưới những vòng dây vừa cuộn và rút tay trái ra.");
        daymem.add("-\tƯu điểm:\n" +
                "Có thể đeo cuộn dây quanh thắt lưng, dễ dàng lấy dây ra, kể cả khi trời tối mà không sợ rối.\n" +
                "-\tNhược điểm:\n" +
                "Khi cuộn không chặt, không đúng kỹ thuật dây dễ bị tuột, khó vận động.\n");
        daymem.add("*\tCách 2: Thu hồi dây vào túi\n" +
                "Áp dụng cho dây mềm, dài và có túi đựng.\n");
        daymem.add("Rải cuộn dây ra, gỡ xoắn. Lộn túi ra, buộc hoặc móc một đầu dây vào đáy, hay móc bên trong túi.");
        daymem.add("Kéo dây và xếp hình số 8 chồng lần lượt lên nhau cho đến khi đầy.");
        daymem.add("Khi gần hết, buộc đầu dây vào quai túi và buộc miệng túi lại");
        daymem.add("-\tƯu điểm:\n" +
                "Có thể đeo cuộn dây quanh người và thuận tiện khi di chuyển, dễ dàng lấy dây ra mà không bao giờ sợ rối, tuột, rơi.\n" +
                "-\tNhược điểm: Phải có túi, đòi hỏi nhiều thời gian khi thu hồi và chỉ áp dụng được cho dây mềm.\n");

        List<String> daycung = new ArrayList<>();

        daycung.add("Áp dụng cho dây dài, khi chất liệu của dây cứng hơn như dây có chất liệu là sợi tổng hợp nilon, kremona, vinylon, polyethylene, polypropylene ...");
        daycung.add("Rải dây ra, sau đó gập đôi sợi dây lại. Hai chiến sĩ nắm hai đầu dây bằng cả hai tay, kéo căng và mạnh dây ít nhất ba lần để dãn xoắn.\n" +
                "Tay trái nắm lấy dây một đầu dây khoảng 40 cm, dùng tay phải đo một đoạn tương đương một sải tay tính từ bàn tay trái\n");
        daycung.add("Cuộn dây bằng cách vặn tay phải vào phía trong cơ thể, từ trên xuống dưới.\n" +
                "Tiếp tục cuộn cho đến khi đoạn cuối ngắn hơn một sải tay.");
        daycung.add("Gập đoạn 40 cm làm đôi để tạo thành một vòng dây. Cuộn đoạn dây thừa vòng tròn quanh thân đoạn dây đã cuộn.\n" +
                "Gập đôi đoạn thừa để tạo thành một vòng dây khác, cuốn vòng dây này vào vòng dây còn lại và kéo mạnh đầu dây còn lại.");
        daycung.add("-\tƯu điểm: Có thể đeo cuộn dây qua vai mang theo khi chữa cháy và CNCH, hoạt động dễ dàng, dễ dàng tháo dây ngay cả ở những vị trí chật hẹp.\n" +
                "-\tNhược điểm: Khi cuộn dây cần phải ở những vị trí rộng. Trong quá trình tháo dây, nếu không đúng động tác có thể dẫn đến rối.");

        List<String> dayngan = new ArrayList<>();

        dayngan.add("Áp dụng cho dây có chiều dài khoảng (3-5) m đeo vào người chiến sỹ sao cho chu vi vòng dây vừa từ vai phải xuống hông trái.");
        dayngan.add("-\tGập đôi dây ngắn, tay trái cầm lấy điểm giữa của dây, sao cho tay úp, ngón trỏ nằm phía trên vòng dây.");
        dayngan.add("-\tTay phải cầm đầu dây còn lại, luồn qua vòng dây ở vị trí tay trái, theo hướng từ dưới lên trên, vòng dây qua ngón trỏ của tay trái theo hướng từ trong ra ngoài, từ trên xuống dưới để tạo được một vòng dây thứ 2. Sau đó đưa đầu dây này vòng từ ngoài vào trong, từ dưới lên trên, và luồn đầu dây vào vòng dây thứ 2 (vòng dây có ngón trỏ).");
        dayngan.add("-\tĐiều chỉnh và xiết chặt.");

        expandableListDetail.put("Dây Mềm",daymem);
        expandableListDetail.put("Dây Cứng",daycung);
        expandableListDetail.put("Dây Ngắn",dayngan);
        return expandableListDetail;
    }
}
