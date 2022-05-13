package com.week4.day16;

import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import java.util.*;
import java.util.List;

public class Main_3 extends JFrame implements ActionListener{
   // 메인화면에 사용할 컴포넌트들을 선언합니다.
    private JButton btnInsert = new JButton("입력");
    private JButton btnUpdate = new JButton("수정");
    private JButton btnDelete = new JButton("삭제");
    private JButton btnSelect = new JButton("조회");
    private JButton btnDetail = new JButton("상세보기");
    Dialog_3 dialog = new Dialog_3 ();
    static Main_3 abook = null;
    public Main_3() {
       initDisplay();
    }
   public void initDisplay() {
     
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setLayout(new FlowLayout());
       btnInsert.addActionListener(this);
       btnUpdate.addActionListener(this); // this 는 main_3를 의미 
       btnDetail.addActionListener(this);
       this.add(btnInsert);
       this.add(btnUpdate);
       this.add(btnDelete);
       this.add(btnSelect);
       this.add(btnDetail);
       this.setTitle("메인 Ver1.0");
       this.setSize(700, 500);
       this.setVisible(true); // 화면을 보여주는 메소드 
   }
   public void refreshData() { // 브라우저의 새로고침 버튼과 같음 f5번! 
      System.out.println("refreshData 호출 성공");
      // 새로고침 후에 자손 화면을 닫기 (자손클래스의 자원 반납을 받는 메소드 호출 )
      dialog.dispose();
   }
   public static void main(String[] args) {
      abook = new Main_3();
      //abook.initDisplay(); > 생성자로 이전했다 ?? 21번 
   }
   @Override
   public void actionPerformed(ActionEvent e) {
      Object obj = e.getSource();
      if(btnInsert == obj) {
    	  // 자손 클래스에서 부모클래스의 refreshData메소드를 호출하고 싶어요
    	  // 그래서 this를 자손클래스의 set메소드의 파라미터로 넘겨주자. 
         dialog.set("입력", true, this);
         dialog.initDisplay();
      }
      else if(btnUpdate == obj) {
         dialog.set("수정", true, this);
         dialog.initDisplay();
      }
      else if(btnDetail == obj) {
         dialog.set("상세조회", true, this);
         dialog.initDisplay();
      }
   }
}






















