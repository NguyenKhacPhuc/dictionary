package com.example.dictionary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpandableSelfHelpDataPump {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<>();
        List<String> stomatch = new ArrayList<>();
        stomatch.add("Hai tay cầm vào dây, một tay cầm ở phía đầu dây cách đầu dây khoảng 15-20 cm. Tạo mối chữ O ở đầu sợi dây sau đó móc khóa chữ O (Karabiner) vào vòng dây.");
        stomatch.add("Thả dây từ từ sao cho móc khóa chữ O (Karabiner) chạm xuống mặt đất, khi móc khóa chữ O (Karabiner) vừa chạm đất thì kéo thẳng dây dọc theo người.");
        stomatch.add("Giữ dây ở điểm ngay dưới rốn sau đó tạo một vòng dây và đưa đầu kia của dây ngang thân người vòng qua đằng sau.");
        stomatch.add("Cuốn dây quanh người, ngay dưới eo, vừa cuốn vừa giữ căng dây sao cho dây cuốn chặt xung quanh vòng dây đã tạo.");
        stomatch.add("Cuốn từ hai đến ba vòng rồi luồn đầu dây qua vòng dây đã tạo ban đầu Tiếp tục luồn xuống dưới đoạn dây đã móc vào móc khóa chữ O (Karabiner).");
        stomatch.add("Cuối cùng luồn ngược trở lại cho đầu dây qua vòng dây và kéo mạnh hai đầu dây cho nút buộc được chặt. Đoạn dây thừa thắt vào vòng dây xung quanh eo.");

        List<String> ben = new ArrayList<>();
        ben.add("Nút buộc này được áp dụng tạo đai ở háng khi sử dụng để tự cứu trong trường hợp chiến sĩ không có thắt lưng an toàn hoặc có nhưng đã bảo hiểm cho người bị nạn");
        ben.add("Chiến sĩ sử dụng dây có chiều dài khoảng 3m, tay phải cầm 2 đầu dây, cách đầu dây khoảng 20cm, đưa một đầu dây từ phía trước ra sau lưng, qua bên trái, hai tay cầm 2 đầu dây tạo mối nối dây cách 1.");
        ben.add("Đưa 2 đầu dây qua háng, hai tay đưa ra phía sau cầm 2 thân dây kéo lên vị trí dây đã tạo ngang qua lưng, khi tới nơi luồn dây từ ngoài vào trong, từ trên xuống dưới, từ trước ra sau, kéo 2 đầu dây về phía trước, đầu dây phía bên phải luồn qua vòng dây dưới háng kéo sang phía bên trái và cùng với đầu dây phía bên trái tạo mối buộc nối dây cách 1 lần nữa, phần đầu thừa của 2 đầu dây tạo nút giữ dây buộc chặn vào sợi dây để đảm bảo an toàn cho mối buộc không bi tuột");

        expandableListDetail.put("Bụng",stomatch);
        expandableListDetail.put("Háng",ben);

        return expandableListDetail;
    }
}
