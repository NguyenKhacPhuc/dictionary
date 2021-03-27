package com.example.dictionary;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

public class ExpandableIntroRopeDataPump {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<>();

        List<String> type = new ArrayList<>();

        type.add("Dây có thể được phân loại dựa theo chất liệu và cấu tạo. ");
        type.add("Về chất liệu, có ba loại là: Sợi tự nhiên (sợi manila, sisal, cotton và sợi của một số loại cây khác...), sợi tổng hợp (nilon, kremona, vinylon, polyethylene, polypropylene ...) và thép (dây điện).");
        type.add("Trong công tác chữa cháy và cứu nạn cứu hộ dùng chủ yếu là 2 loại dây làm từ sợi tự nhiên và sợi tổng hợp, dây làm từ sợi gai dầu manila và sợi nilon được sử dụng nhiều nhất và thường có đường kính là 12mm");
        type.add("Dây thép là dây thường được sử dụng vào những mục đích đặc biệt.");
        type.add("Cách gọi thông dụng dựa vào cách tết và sắp xếp sợi như dây ba sợi, dây tám sợi v.v");
        type.add("-\tƯu điểm:\n" +
                "+ Dây có tính đàn hồi cao, mềm dẻo và có khả năng chịu được lực tác động đột ngột.\n" +
                "+ Dây có thể xoắn dễ dàng.\n" +
                " \n" +
                "+ Chịu được lực kéo căng gấp 3,5 lần so với dây làm từ sợi gai dầu manila.\n" +
                "+ Trọng lượng của dây tương đương 84% của dây làm từ sợi gai dầu manila.\n" +
                "+ Dễ phục hồi sửa chữa dây.\n" +
                "-\tNhược điểm:\n" +
                "+ Không chịu được nhiệt độ cao\n" +
                "+ Không chịu được lực chà xát mạnh\n" +
                "+ Không chịu được tác động của các chất hoá học\n");
        type.add("Tác dụng của dây sẽ bị giảm nếu dây có nhiều nút buộc, dây bị xoắn hoặc bị chà xát mạnh vào mép của một vật dẫn đến mòn xước dây.");
        type.add("Phải chọn loại dây có thể chịu được sức nặng của vật, chọn phương pháp sử dụng dây hiệu quả nhất và phải tuân thủ một số nguyên tắc sau đây:\n" +
                "-\tKhông sử dụng dây có dấu hiệu hư hỏng hoặc dây đã bị ẩm, ngấm nước\n" +
                "-\tKhông giẫm lên dây hoặc kéo lê trên mặt sàn làm dây bị trầy xước\n" +
                "-\tKhông ném dây từ trên cao xuống khi dây đang ở trạng thái cuộn và không thả vật nặng lên dây\n" +
                "-\tKhi treo dây lên gờ, điểm nhô ra của các bộ phận kiến trúc, phải lót khăn, mảnh vải hay bất kỳ chất liệu nào khác để tránh cho dây bị hỏng, đứt, xước\n" +
                "-\tKhông sử dụng dây khi dây đang bị xoắn hay ở tình trạng không bình thường vì điều này có thể làm cho dây bị vặn và xoắn mạnh cũng như không để dây tải vật nặng quá lâu.\n" +
                "-\tKhi sử dụng đồng thời nhiều dây, các dây phải có màu sắc khác nhau.\n" +
                "-\tKhi bố trí dây để cứu người, tự cứu hay mang vật, phải sử dụng dây có độ dài hợp lý để không có nút buộc nào trừ đầu dây chạm đất\n");

        ArrayList<String> maintain = new ArrayList<>();

        maintain.add("Cần phải chú ý những điểm sau đây khi cất giữ dây:\n" +
                "+ Tránh ánh nắng mặt trời chiếu trực tiếp vào dây.\n" +
                "+ Bảo quản nơi thoáng mát và không để các cuộn dây sát nhau.\n" +
                "+ Bảo quản nơi khô ráo, tránh ẩm thấp.\n" +
                "+ Để xa muối và axít.\n" +
                "+ Tránh nấm mốc và vi khuẩn.\n" +
                "+ Bảo quản để tránh hư hại và xuống cấp. Khi phải treo dây trên tường, không dùng đinh hay các vật để treo khác có thể làm hỏng dây.\n" +
                "+ Không để dây trực tiếp trên sàn nhà mà phải bảo quản trên giá.\n" +
                "+ Không chồng các cuộn dây lên nhau hay để các vật nặng khác đè lên dây.\n" +
                "+ Khi sử dụng xong phải cuộn dây lại sao cho đường kính của cuộn dây bằng một sải tay hoặc các phương pháp phù hợp khác.\n");
        maintain.add("Kiểm tra dây theo trình tự dưới đây, áp dụng các biện pháp như loại bỏ nếu gặp bất kỳ điểm không bình thường nào.\n" +
                "+ Đoạn đứt.\n" +
                "+ Biến dạng.\n" +
                "+ Rão.\n" +
                "+ Xước, xổ.\n" +
                "+ Ẩm hoặc khô hơn mức cho phép.\n" +
                "+ Dính vào các vật khác.\n" +
                "+ Đầu dây bị hỏng.\n");
        maintain.add("Bảo quản\n" +
                "+ Sau khi sử dụng dây, chiến sĩ phải tiến hành các bước bảo quản dây sau đây để giữ cho dây luôn ở tình trạng tốt cho các lần sử dụng sau.\n" +
                "+ Vệ sinh bụi bẩn bám vào dây.\n" +
                "+ Nếu dây ẩm thì phải phơi khô trong bóng râm, không phơi trực tiếp ngoài nắng hay sấy khô bằng lửa.\n" +
                "+ Nếu đoạn nào của dây bị dính dầu, bùn, hay các loại hoá chất khác thì cắt bỏ đoạn đó đi và tạm thời dính hoặc đốt đầu dây để đầu dây không bị bung, sờn.\n" +
                "+ Giữ cho dây không bị xoắn, vặn.\n" +
                "+ Nếu có điểm nào trên dây bị hư hỏng, cắt bỏ và nối phần còn dùng được lại, hoặc có thể lọai bỏ toàn bộ dây.\n");

        expandableListDetail.put("Phân Loại",type);
        expandableListDetail.put("Bảo Quản",maintain);
        return expandableListDetail;
    }
}
