import java.util.Arrays;

public class QuadraticSort {
    public void sort(int[] data)
    {
        int temp, j;
        for(int i = 0; i < data.length - 1; i++)
        {
            if (data[i] > data[i + 1])
            {
                temp = data[i + 1];
                data[i + 1] = data[i];

                for (j = i; j >0 && temp < data[j - 1]; j--)
                    data[j] = temp;
            }
        }
    }
}
