package sum11;

import java.io.IOException;
import java.util.*;



public class Main {

        private static SortedMap<Integer, List<Integer>> map = new TreeMap<Integer, List<Integer>>();
        private static final Scanner scanner = new Scanner(System.in);

        String findPairs(int[] arr, int sum){

            for(int i=0;i<arr.length;i++){
                List<Integer> indexList = map.get(arr[i]);
                if(indexList == null){
                    List<Integer> newIndexList = new ArrayList<Integer>();
                    newIndexList.add(i);
                    map.put(arr[i], newIndexList);
                }else{
                    indexList.add(i);
                }
            }

            Set s = map.entrySet();

            HashMap<Integer, Boolean> visited = new HashMap<Integer, Boolean>();

            // Using iterator in SortedMap
            Iterator it = s.iterator();

            String finalOutput = "";

            while (it.hasNext())
            {
                Map.Entry m = (Map.Entry)it.next();

                int key = (Integer)m.getKey();
                List<Integer> indexList1 = (List<Integer>)m.getValue();

                if(map.containsKey(sum-key)){

                    List<Integer> indexList2 = (List<Integer>)map.get(sum-key);

                    for(int i=0;i<indexList1.size();i++){

                        if(!visited.containsKey(indexList1.get(i))){

                            for(int j=0;j<indexList2.size();j++){
                                if(!(finalOutput.equals("") || finalOutput==null)){
                                    finalOutput += ", ";
                                }
                                finalOutput += "(" + indexList1.get(i) + "," + indexList2.get(j) + ")";
                                visited.put(indexList2.get(j), true);
                            }
                            visited.put(indexList1.get(i), true);
                        }
                    }
                }
            }

            return finalOutput;
        }

        public static void main(String[] args) throws IOException {

            int[] arr = {2,7,4,0,11,6,5};
            int sum = 11;

            Main obj = new Main();

            System.out.println(obj.findPairs(arr, sum));
        }
    }
