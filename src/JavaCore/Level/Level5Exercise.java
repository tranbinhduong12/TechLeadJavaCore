package JavaCore.Level;

import java.util.*;

public class Level5Exercise {
    Scanner sc = new Scanner(System.in);
    //5.1 đảo ngược phần tử trong mảng
    public void reverseArr() {
        System.out.println("input numbers: ");
        String[] input = sc.nextLine().trim().split(" ");

        int[] arr = new int[input.length];
         for (int i = 0; i < input.length;i++) {
             arr[i] = Integer.parseInt(input[i]);
         }

         if (arr.length == 0) {
             System.out.println("arr empty");
             return;
         }

         //đảo ngược mảng
        int[] reversed = new int[arr.length];
         for (int i = 0; i < arr.length; i++) {
             reversed[i] = arr[arr.length-1 - i];
         }

        System.out.println("Reversed array: ");
         for (int num : reversed) {
             System.out.print(num + " ");
         }
    }

    // 5.2 chia mảng theo số chunk chỉ định
    public void chunkArray() {
        System.out.println("input numbers: ");

        String[] input = sc.nextLine().split(" ");
        int[] arr = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        if (arr.length == 0) {
            System.out.println("arr empty");
            return;
        }

        System.out.println("input chunk size: ");
        int chunkSize = Integer.parseInt(sc.nextLine());

        if (chunkSize <= 0) {
            System.out.println("chunk must > 0");
            return;
        }

        System.out.println("chunked array: ");
        for (int i = 0; i < arr.length; i += chunkSize) {
            System.out.print("[");
            for (int j = i; j < i + chunkSize && j < arr.length; j++) {
                System.out.print(arr[j]);
                if (j < i+ chunkSize - 1 && j  < arr.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }

    // 5.3 loại bỏ các phần tử trùng trong mảng
    public void uniq() {
        System.out.println("input numbers: ");
        String[] input = sc.nextLine().trim().split(" ");
        Set<Integer> seen = new LinkedHashSet<>(); // giữ nguyên thứ tự

        for (String num : input) {
            if (!num.isEmpty()) {
                seen.add(Integer.parseInt(num));
            }
        }

        if (seen.isEmpty()) {
            System.out.println("arr empty");
            return;
        }

        System.out.println("unique array: ");
        for (int num : seen) {
            System.out.print(num + " ");
        }
    }

    // 5.4 loại bỏ các phần tử trùng trong collection - chưa làm được
    public void uniqObjArr() {
        System.out.println("input ");
    }

    //5.5 trả về các obj theo trường chỉ định - chưa làm được

    //5.6 xóa khoảng trắng ở đầu và cuối, nếu ở giữa có nhiều khoảng trắng liên tiếp chỉ giữ lại 1
    // vd: "    hello   guys    " -> "hello guys";
    public void trimStr() {
        System.out.println("input strings: ");
        String input = sc.nextLine();

        if (input.trim().isEmpty()) {
            System.out.println("empty string");
            return;
        }

        // xóa khoảng trắng đầu cuối và thay khoảng trắng liên tiếp ở giữa thành 1 khoảng trắng
        String result = input.trim().replaceAll("\\s+", " ");

        System.out.println("trimmed string: ");
        System.out.println(result);

    }

    //5.7 MapKey: trả về danh sách các obj có key đã chọn - chưa làm được


    // 5.8 thay đổi thứ tự order của các obj - copy caht gpt - cần thêm thời gian để hiểu
    public void switchOrder() {
        System.out.println("input the number of elements: ");
        int n = Integer.parseInt(sc.nextLine());
        List<Map<String, Integer>> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.print(" input id & order: ");
            String[] parts = sc.nextLine().trim().split("\\s+");
            int id = Integer.parseInt(parts[0]);
            int order = Integer.parseInt(parts[1]);

            Map<String, Integer> obj = new HashMap<>();
            obj.put("id", id);
            obj.put("order", order);

            list.add(obj);
        }

        System.out.println("input the ID to transfer: ");
        int targetId = Integer.parseInt(sc.nextLine());

        System.out.println("input new order: ");
        int newOrder = Integer.parseInt(sc.nextLine());

        // sắp xếp danh sách theo order hiện tại
        list.sort(Comparator.comparingInt(o -> o.get("order")));

        // Tìm và gỡ obj cần chuyển
        Map<String, Integer> target = null;
        for (Map<String, Integer> obj : list) {
            if(obj.get("id") == targetId) {
                target = obj;
                break;
            }
        }

        if (target == null) {
            System.out.println("not found id: " + targetId);
            return;
        }

        list.remove(target);

        // chèn vào vị trí mới
        if (newOrder < 0) newOrder = 0;
        if (newOrder > list.size()) newOrder = list.size();
        list.add(newOrder, target);

        //cập nhật lại thứ tự order
        for (int i = 0; i < list.size(); i++) {
            list.get(i).put("order", i);
        }

        System.out.println("result:");
        for (Map<String, Integer> obj : list) {
            System.out.println(obj);
        }
    }

    // 5.9 tính tổng giá trị của các key của các phần tử con trong mảng bất kỳ
    // - copy caht gpt - cần thêm thời gian để hiểu
    public void sumAll() {
        System.out.println("Input the number of objects: ");
        int n = Integer.parseInt(sc.nextLine());

        List<Map<String, String>> list = new ArrayList<>();
        System.out.println("input object: ");

        for (int i = 0; i < n; i++) {
            System.out.print("Object " + (i+1) + ": ");
            String[] parts = sc.nextLine().trim().split("\\s+");
            Map<String, String> obj = new HashMap<>();
            for (String part : parts) {
                String[] kv = part.split("=");
                if (kv.length == 2) {
                    obj.put(kv[0], kv[1]);
                }
            }
            list.add(obj);
        }

        Map<String, Integer> result = new LinkedHashMap<>();
        for (Map<String, String> obj : list) {
            for (Map.Entry<String, String> entry : obj.entrySet()) {
                String key = entry.getKey();
                String valStr = entry.getValue();
                try {
                    int val = Integer.parseInt(valStr);
                    result.put(key, result.getOrDefault(key, 0) + val);
                } catch (NumberFormatException e) {
                    System.out.println("invalid value: " +valStr);
                }
            }
        }
        System.out.println("sum key: " + result);
    }
}
