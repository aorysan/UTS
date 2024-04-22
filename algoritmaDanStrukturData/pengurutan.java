class pengurutan {
    
    void mergeSort(int data[], int left, int right, int mid) {
        int temp[] = new int[data.length];

        for(int i = left; i <= right; i++) {
            temp[i] = data[i];
        }

        int a = left, b = mid + 1, c = left;
        
        while(a <= mid && b <= right) {
            if(temp[a] <= temp[b]) {
                data[c] = temp[a];
                a++;
            } else {
                data[c] = temp[b];
                b++;
            }
            c++;
        }

        int x = mid - a;

        for(int i = 0; i <= x; i++) {
            data[c + i] = temp[a + i];
        }
    }

    void sort(int data[], int left, int right) {
        if(left < right) {
            int mid = (left + right) / 2;

            sort(data, left, mid);
            sort(data, mid + 1, right);

            mergeSort(data, left, right, mid);
        }
    }


    void display(int data[]) {
        for(int i = 0; i < data.length; i++) {
            System.out.println("Nilai pada index ke-" + i + " : " + data[i]);
        }
    }

    void search(int cari, int data[]) {
        for(int i = 0; i < data.length; i++) {
            if(cari == data[i]) {
                System.out.println("data ditemukan pada index ke : " + i);
                System.out.println(data[i]);
            }
        }
    }
}
