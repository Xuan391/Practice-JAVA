package level5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class bai8 {
    public static void main(String[] args){
        List<OrderObject> orderObjects = new ArrayList<>();
        orderObjects.add(new OrderObject(10, 0));
        orderObjects.add(new OrderObject(12, 1));
        orderObjects.add(new OrderObject(9, 2));
        orderObjects.add(new OrderObject(11, 3));

        switchOrder(orderObjects, 9, 1);
        for(OrderObject orderObject: orderObjects){
            System.out.println(orderObject);
        }

    }

    public static void switchOrder(List<OrderObject> arr, int id, int newOrder) {
        OrderObject objToSwitch = null;
        OrderObject objToMove = null;

        for (OrderObject obj : arr) {
            if (obj.getId() == id) {
                objToSwitch = obj;
            } else if (obj.getOrder() == newOrder) {
                objToMove = obj;
            }
        }

        if (objToSwitch != null && objToMove != null) {
            int originalOrder = objToSwitch.getOrder();
            objToSwitch.setOrder(newOrder);
            objToMove.setOrder(originalOrder);
            arr.sort((o1, o2) -> Integer.compare(o1.getOrder(), o2.getOrder()));
        }
    }

    static class OrderObject {
        private int id;
        private int order;

        public OrderObject(int id, int order) {
            this.id = id;
            this.order = order;
        }

        public int getId() {
            return id;
        }

        public int getOrder() {
            return order;
        }

        public void setOrder(int order) {
            this.order = order;
        }

        @Override
        public String toString() {
            return "OrderObject{" +
                    "id=" + id +
                    ", order=" + order +
                    '}';
        }
    }
}
