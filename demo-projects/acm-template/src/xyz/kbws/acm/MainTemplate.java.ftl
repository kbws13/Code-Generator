package xyz.kbws.acm;

import java.util.Scanner;

/**
 * 多个数之和
 */
public class MainTemplate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            // 读取输入元素的个数
            int n = scanner.nextInt();

            // 读取数组
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            // 处理问题逻辑，根据需要进行输出
            // 实例：计算数组元素的和
            int sum = 0;
            for (int i : arr) {
                sum += i;
            }

            System.out.println("${outputText}" + sum);
        }

        scanner.close();
    }
}