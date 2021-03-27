package com.example.dictionary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpandableConnectRopeDataPump {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<>();

        List<String> cach1 = new ArrayList<>();

        cach1.add("Áp dụng khi hai dây có đường kính và chất liệu tương đồng, hoặc khi cõng người, làm đai an toàn…");
        cach1.add("Hai tay cầm hai đầu của hai sợi dây, cách đầu dây khoảng 30 cm, buộc vòng 2 đầu dây vào nhau, đặt đầu sợi dây ở tay phải nằm trên sợi dây tay trái rồi tạo nút.");
        cach1.add("Đặt dây ở tay phải bên dưới dây của tay trái và buộc tiếp thì tạo thành nút thắt, cầm 2 đầu dây kéo chặt.");
        cach1.add("Cầm 2 đầu dây phía bên ngoài buộc chặn vào 2 đầu sợi dây để giữ cố định đảm bảo an toàn, 2 đầu dây tính từ nút thắt phải có độ dài khoảng 15 cm.");
        cach1.add("Điều chỉnh và kéo chặt hai đầu dây sao cho phần thừa dài từ 15 cm.");

        ArrayList<String> cach2 = new ArrayList<>();

        cach2.add("Nối dây cách 2 là một trong những cách để nối hai dây với nhau khi hai dây có đường kính khác nhau.");
        cach2.add("Hai tay cầm hai đầu của hai sợi dây, cách đầu dây khoảng 20cm, Tay trái gập đầu dây làm đôi để tạo thành một vòng dây (phần đầu dây gập đôi khoảng 20 cm).");
        cach2.add("Dùng tay phải luồn một đầu dây còn lại qua vòng dây đã tạo từ dưới lên trên qua vòng dây, quấn dây thứ hai một vòng quanh ngón trỏ của tay trái, dưới dây thứ nhất và sau đó lại luồn xuống dưới dây thứ hai.");
        cach2.add("Kéo mạnh hai đầu dây thắt thật chặt. Cầm 1 đầu dây phía bên tay trái buộc chặn vào sợi dây để giữ cố định đảm bảo an toàn, 2 đầu dây tính từ nút thắt phải có độ dài từ 15 cm.");

        ArrayList<String> cach3 = new ArrayList<>();

        cach3.add("Áp dụng khi hai dây có đường kính chênh lệch nhau; dây dính nước, dầu…");
        cach3.add("Hai tay cầm hai đầu của hai sợi dây, cách đầu dây khoảng 20cm, Tay trái gập đầu dây làm đôi để tạo thành một vòng dây (Phần dây gập đôi khoảng 20 cm).");
        cach3.add("Dùng tay phải luồn một đầu dây còn lại qua vòng dây đã tạo từ dưới lên trên qua vòng dây, quấn dây thứ hai một vòng quanh ngón trỏ của tay trái, dưới dây thứ nhất và sau đó lại luồn xuống dưới dây thứ hai.");
        cach3.add("Vòng thêm một vòng nữa và kéo mạnh hai đầu dây thắt chặt lại.");
        cach3.add("Cầm 1 đầu dây phía bên tay trái buộc chặn vào sợi dây để giữ cố định đảm bảo an toàn, 2 đầu dây tính từ nút thắt phải có độ dài khoảng 15 cm.");

        expandableListDetail.put("Cách 1",cach1);
        expandableListDetail.put("Cách 2",cach2);
        expandableListDetail.put("Cách 3",cach3);
        return expandableListDetail;
    }
}
