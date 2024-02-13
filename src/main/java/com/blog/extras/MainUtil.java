package com.blog.extras;

public class MainUtil {
//    private static String anotherString;

    public static void main(String[] args) {

//        Predicate<String> condition = y->y.equals("mike");
//        boolean val = condition.test("mike");
//        System.out.println(val);

//        List<Integer> data = Arrays.asList(10,20,30,5,50,100);
//        List<Integer> newdata= data.stream().filter(x -> x > 20).collect(Collectors.toList());
//        System.out.println(newdata);

//        List<String> data = Arrays.asList("mike","stallin","mithun","adam","smith","micheal");
////        List<String> newData = data.stream().filter(x->x.startsWith("m")).collect(Collectors.toList());
//        List<String> newData = data.stream().filter(x->x.endsWith("n")).collect(Collectors.toList());
//        System.out.println(newData);
//        List<String> data = Arrays.asList("mike","stallin","mithun","mike","adam","smith","micheal");
//        List<String> newData = data.stream().filter(x->x.equals("mike")).collect(Collectors.toList());
//        System.out.println(newData.size());


//        Employee emp1 = new Employee();
//        emp1.setName("mike");
//        emp1.setCity("bangaluru");
//        emp1.setSalary(10000);
//
//        Employee emp2 = new Employee();
//        emp2.setName("stallin");
//        emp2.setCity("chennai");
//        emp2.setSalary(5000);
//
//        Employee emp3 = new Employee();
//        emp3.setName("smith");
//        emp3.setCity("bangaluru");
//        emp3.setSalary(10000);
//
//        Employee emp4 = new Employee();
//        emp4.setName("adam");
//        emp4.setCity("Delhi");
//        emp4.setSalary(8000);

//        List<Employee> data = Arrays.asList(emp1,emp2,emp3,emp4);
//        List<Employee> newData = data.stream().filter(e->e.getSalary()==5000).collect(Collectors.toList());
//        System.out.println(newData);
//        System.out.println(newData.size());

//        List<Employee> data = Arrays.asList(emp1,emp2,emp3,emp4);
//        List<Employee> newData = data.stream().filter(e->e.getSalary()==10000).collect(Collectors.toList());
//
//        for(Employee employee :newData) {
//            System.out.println(employee.getName());
//            System.out.println(employee.getCity());
//            System.out.println(employee.getSalary());
//        }
//        List<Employee> data = Arrays.asList(emp1,emp2,emp3,emp4);
//        List<Employee> newData = data.stream().filter(e->e.getCity().equalsIgnoreCase("delhi")).collect(Collectors.toList());
//
//        for(Employee employee :newData) {
//            System.out.println(employee.getName());
//            System.out.println(employee.getCity());
//            System.out.println(employee.getSalary());
//        }
//
//        List<Integer> data = Arrays.asList(10,5,2,20);
//        List<Integer> newData = data.stream().map(n->n*n).collect(Collectors.toList());
//        System.out.println(newData);

//        List<Integer> data = Arrays.asList(10,5,2,20);
//        List<Integer> newData = data.stream().map(n->n+10).collect(Collectors.toList());
//        System.out.println(newData);

//        List<Integer> data = Arrays.asList(10,5,2,20);
//        List<Integer> newData = data.stream().map(n->n/2).collect(Collectors.toList());
//        System.out.println(newData);

//        List<Integer> data = Arrays.asList(10,5,2,20);
//        List<Integer> newData = data.stream().sorted().collect(Collectors.toList());
//        System.out.println(newData);

//        List<String> data = Arrays.asList("mike","adam","stallin","mithun");
//        List<String> newData = data.stream().sorted().collect(Collectors.toList());
//        System.out.println(newData);

//        List<Integer> data = Arrays.asList(10,2,10,34,21,23,5,2);
//        List<Integer> newData = data.stream().distinct().collect(Collectors.toList());
//        System.out.println(newData);

//        MainUtil mainUtil = new MainUtil();
//
//        Post post1 = new Post();
//        post1.setId(1);
//        post1.setTitle("aaa");
//        post1.setContent("aaaa");
//
//        Post post2 = new Post();
//        post2.setId(2);
//        post2.setTitle("bbb");
//        post2.setContent("bbbb");
//
//        Post post3 = new Post();
//        post3.setId(3);
//        post3.setTitle("ccc");
//        post3.setContent("cccc");
//
////       PostDto dto1 = mapToDto(post1);
////       PostDto dto2 = mapToDto(post2);
////       PostDto dto3 = mapToDto(post3);
//        List<Post> posts = Arrays.asList(post1,post2,post3);
//
//        List<PostDto> dtos = posts.stream().map(p -> mapToDto(p)).collect(Collectors.toList());
////        List<PostDto> dtos = posts.stream().map(MainUtil::mapToDto).collect(Collectors.toList());
//         System.out.println(dtos);
//
//    }
//
//   static PostDto mapToDto(Post post){
//        PostDto dto = new PostDto();
//        dto.setId((post.getId()));
//        dto.setTitle(post.getTitle());
//        dto.setContent(post.getContent());
//        return  dto;

//       List<Integer> numbers = Arrays.asList(10,100,200,5900,1000,5000,10000);
//       numbers.stream().max();


//        Movie m1 = new Movie("bbb",8,1999);
//        Movie m2 = new Movie("aaa",6,1986);
//        Movie m3 = new Movie("ccc",9,2000);
//
//        ArrayList<Movie> list = new ArrayList<Movie>();
//        list.add(m1);
//        list.add(m2);
//        list.add(m3);

//        Collections.sort(list);
//        MovieYear movieYear = new MovieYear();
//        Collections.sort(list,movieYear);
//        MovieRating movieRating = new MovieRating();
//        Collections.sort(list,movieRating);

//        MovieName movieName = new MovieName();
//        Collections.sort(list,movieName);
//
//        for (Movie m:list) {
//            System.out.println(m.getName());
//            System.out.println(m.getYear());
//            System.out.println(m.getRating());
//

//        List<Integer> numbers = Arrays.asList(100,500,5,4000,5000,10000,2000);
//
//        Integer maxVal = numbers.stream().max(Integer::compareTo).get();
//
//        Integer minVal = numbers.stream().min(Integer::compareTo).get();
//        System.out.println((maxVal));
//        System.out.println((minVal));
//    }

//        List<Employe> names = Arrays.asList(new Employe(2,"xyz"),new Employe(1,"abc"));
//
//        Employe employe = names.stream().max(Employe::compareTo).get();
//
//        System.out.println(employe.getId());
//        System.out.println(employe.getName());

//        List<Employe> names = Arrays.asList(new Employe(2,"xyz"),new Employe(1,"abc"));
//
//        Employe employe = names.stream().min(Employe::compareTo).get();
//
//        System.out.println(employe.getId());
//        System.out.println(employe.getName());


//        List<Employ> data = Arrays.asList(
//                new Employ("mike",5000),
//                new Employ("stallin",10000),
//                new Employ("adam",5000)
//        );
//
//        Map<Double, List<Employ>> groups = data.stream().collect(Collectors.groupingBy(Employ::getSalary));
//        System.out.println(groups);


//
//        List<Employ> data = Arrays.asList(
//                new Employ("mike", 5000),
//                new Employ("stallin", 10000),
//                new Employ("adam", 5000)
//        );
//
//        Map<Double, List<Employ>> groups = data.stream().collect(Collectors.groupingBy(Employ::getSalary));
//
//        System.out.println(groups);
//
//        for (Map.Entry<Double, List<Employ>> entry : groups.entrySet()) {
//            double salary = entry.getKey();
//            List<Employ> employList = entry.getValue();
//            System.out.println("Employees with salary: " + salary);
//            for (Employ employ : employList) {
//                System.out.println("\t" + employ.getName());
//            }

//        Map<String, List<Employ>> groups = data.stream().collect(Collectors.groupingBy(Employ::getName));
//
//        System.out.println(groups);
//
//        for (Map.Entry<String, List<Employ>> entry: groups.entrySet()) {
//            String salary = entry.getKey();
//            List<Employ> employList = entry.getValue();
//            System.out.println("Employees with salary: " +salary);
//            for (Employ employ : employList) {
//                System.out.println("\t" + employ.getName());
//            }

//        //result = (condition) ?expression1: expression2;
//        int x = 100;
//        int y=20;
//        int max =(x>y)?x:y;
//        System.out.println(max);
//            System.out.println(Sort.Direction.DESC);

        }


    }


