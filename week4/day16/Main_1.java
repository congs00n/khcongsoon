package com.week4.day16;

import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import java.util.*;
import java.util.List;

public class Main_1 extends JFrame implements ActionListener {
   // 메인화면에 사용할 컴포넌트들을 선언합니다.
    private JButton btnInsert = new JButton("입력");
    private JButton btnUpdate = new JButton("수정");
    private JButton btnDelete = new JButton("삭제");
    private JButton btnSelect = new JButton("조회");
    private JButton btnDetail = new JButton("상세보기");
   // 서브창을 참조하는 참조변수 dialog 선언 
    Dialog_1 dialog = null;
   
   // 메소드 
   public void initDisplay() {
      dialog = new Dialog_1();
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // JFrame은 디폴트 레이아웃이 BorderLayout인데 내가 굳이 일부러 FlowLayout변경설정합니다.
       // FlowLayout은 디폴트가 왼쪽에서 오른쪽으로 배치가 되는 레이아웃을 담당하는 클래스 입니다. 
       this.setLayout(new FlowLayout());
       // 입력 버튼이 눌려졌을 때 누가? JVM이 감지하고 이벤트 처리 메소드를 호출해주는 역할
       // 아래 코드가 없으면 느낄 수가 없다. - 딱 한번만 호출되어야 한다. 
       
       // 이벤트 발생을 감지하기 위해 btnInsert Component 에 이벤트를 감지하는 Listener를 붙여주는 코드 
       btnInsert.addActionListener(this);
       // this : who? Main_1 , 	super : who? JFrame  
       
// Container 를 만들어주는 메소드 
       this.add(btnInsert);
       this.add(btnUpdate);
       this.add(btnDelete);
       this.add(btnSelect);
       this.add(btnDetail);
       this.setTitle("메인 Ver1.0");
       this.setSize(700, 500);
       this.setVisible(true);
   }
   /** 36 - 37 생성자 정의되지 않았다. 38번 핫스팟! 
    * 19-20
    * **/
   public static void main(String[] args) {
      Main_1 abook = new Main_1();
      abook.initDisplay();
   }
   @Override
   public void actionPerformed(ActionEvent e) {
      Object obj = e.getSource();
      if(btnInsert == obj) {
         dialog.initDisplay();
      }
   
}
}