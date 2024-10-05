package adminFunction;

import controller.DictionaryController;
import model.AdminModel;
import view.DictionaryView;

import javax.swing.*;
import java.awt.*;

public class Login extends AdminFunction {
    DictionaryController dictionaryController = new DictionaryController(this);
    public Login(DictionaryView dictionaryview) {
        super(dictionaryview);
        this.adminModel = new AdminModel();
    }
    // phần đăng nhập cho admin
    private JTextField jtextField_tenDangNhap;
    private JTextField jtextField_matKhau;
    private JLabel jlabel_tenDangNhap;
    private JLabel jlabel_matKhau;
    public JLabel jLabel_checkDangNhap;
    private JMenuItem jmenu_item_DangNhap;
    private JPanel jpanel_DangNhap;
    private JPanel jpanel_click_DangNhap;
    private JPanel jpanel_noiDung_DangNhap;
    private AdminModel adminModel;
    private JLabel jlabel_4;
    private JLabel jlabel_5;
    private JLabel jlabel_6;
    private JLabel jlabel_7;

    public void dangNhap(){

        this.jtextField_tenDangNhap = new JTextField();
        this.jtextField_tenDangNhap.setFont(new Font("Tahoma", Font.BOLD, 30));

        this.jtextField_matKhau = new JTextField();
        this.jtextField_matKhau.setFont(new Font("Tahoma", Font.BOLD, 30));

        this.jlabel_tenDangNhap = new JLabel("Tên đăng nhập");
        this.jlabel_tenDangNhap.setFont(new Font("Tahoma", Font.BOLD, 30));

        this.jlabel_matKhau = new JLabel("Mật khẩu");
        this.jlabel_matKhau.setFont(new Font("Tahoma", Font.BOLD, 30));

        this.jLabel_checkDangNhap = new JLabel("");
        this.jLabel_checkDangNhap.setFont(new Font("Tahoma", Font.BOLD, 14));
        this.jLabel_checkDangNhap.setForeground(new Color(255,0,0));

        this.jmenu_item_DangNhap = new JMenuItem("Đăng nhập");
        this.jmenu_item_DangNhap.setFont(new Font("Tahoma", Font.BOLD, 40));
        this.jmenu_item_DangNhap.setForeground(new Color(255, 255, 255));
        this.jmenu_item_DangNhap.addActionListener(this.dictionaryController);

        JPanel jpanel_khoangTrong_1 = new JPanel(new BorderLayout());
        jpanel_khoangTrong_1.setBackground(new Color(154,205,50));
        JLabel jlabel_14 = new JLabel("        ");
        jlabel_14.setFont(new Font("Tahoma", Font.BOLD, 80));
        //jlabel_14.setBackground(new Color(154,205,50));
        jpanel_khoangTrong_1.add(jlabel_14, BorderLayout.CENTER);

        JPanel jpanel_khoangTrong_2 = new JPanel(new BorderLayout());
        jpanel_khoangTrong_2.setBackground(new Color(154,205,50));
        JLabel jlabel_15 = new JLabel("        ");
        jlabel_15.setFont(new Font("Tahoma", Font.BOLD, 80));
        //jlabel_14.setBackground(new Color(0,205,50));
        jpanel_khoangTrong_2.add(jlabel_15, BorderLayout.CENTER);

        JPanel jpanel_khoangTrong_3 = new JPanel(new BorderLayout());
        jpanel_khoangTrong_3.setBackground(new Color(154,205,50));
        JLabel jlabel_16 = new JLabel("        ");
        jlabel_16.setFont(new Font("Tahoma", Font.BOLD, 80));
        //jlabel_14.setBackground(new Color(154,205,50));
        jpanel_khoangTrong_3.add(jlabel_16, BorderLayout.CENTER);

        JPanel jpanel_khoangTrong_4 = new JPanel(new BorderLayout());
        jpanel_khoangTrong_4.setBackground(new Color(154,205,50));
        JLabel jlabel_17 = new JLabel("        ");
        jlabel_17.setFont(new Font("Tahoma", Font.BOLD, 80));
        //jlabel_14.setBackground(new Color(154,205,50));
        jpanel_khoangTrong_4.add(jlabel_17, BorderLayout.CENTER);


        this.jpanel_noiDung_DangNhap = new JPanel(new GridLayout(5, 2, 10, 10));
        this.jpanel_noiDung_DangNhap.setBackground(new Color(154,205,50));
        this.jpanel_noiDung_DangNhap.add(this.dictionaryView.jlabel_1);
        this.jpanel_noiDung_DangNhap.add(this.dictionaryView.jlabel_2);

        this.jpanel_noiDung_DangNhap.add(this.jtextField_tenDangNhap);
        this.jpanel_noiDung_DangNhap.add(this.jlabel_tenDangNhap);
        this.jpanel_noiDung_DangNhap.add(this.jtextField_matKhau);
        this.jpanel_noiDung_DangNhap.add(this.jlabel_matKhau);
        this.jpanel_noiDung_DangNhap.add(this.jLabel_checkDangNhap);
        this.jpanel_noiDung_DangNhap.add(this.dictionaryView.jlabel_9);

//        jpanel_noiDung_DangNhap.add(jlabel_11);
//        jpanel_noiDung_DangNhap.add(jlabel_10);


        this.jpanel_click_DangNhap = new JPanel(new BorderLayout());
        this.jpanel_click_DangNhap.setBackground(new Color(75,0,130));
        //jpanel_click_DangNhap.add(jLabel_checkDangNhap, BorderLayout.NORTH);
        this.jpanel_click_DangNhap.add(this.jmenu_item_DangNhap, BorderLayout.CENTER);
        this.jpanel_click_DangNhap.add(jpanel_khoangTrong_1, BorderLayout.NORTH);
        this.jpanel_click_DangNhap.add(jpanel_khoangTrong_3, BorderLayout.EAST);
        this.jpanel_click_DangNhap.add(jpanel_khoangTrong_2, BorderLayout.WEST);
        this.jpanel_click_DangNhap.add(jpanel_khoangTrong_4, BorderLayout.SOUTH);

        this.jpanel_DangNhap = new JPanel(new BorderLayout());
        this.jpanel_DangNhap.setBackground(new Color(154,205,50));
        this.jpanel_DangNhap.add(this.jpanel_noiDung_DangNhap, BorderLayout.CENTER);
        this.jpanel_DangNhap.add(this.jpanel_click_DangNhap, BorderLayout.SOUTH);

        this.jlabel_4 = new JLabel("       ");
        this.jlabel_4.setFont(new Font("Tahoma", Font.BOLD, 80));
        this.jlabel_4.setBackground(new Color(0, 128, 64));

        this.jlabel_5 = new JLabel("       ");
        this.jlabel_5.setFont(new Font("Tahoma", Font.BOLD, 80));
        this.jlabel_5.setBackground(new Color(0, 128, 64));

        this.jlabel_6 = new JLabel("       ");
        this.jlabel_6.setFont(new Font("Tahoma", Font.BOLD, 80));
        this.jlabel_6.setBackground(new Color(0, 128, 64));

        this.jlabel_7 = new JLabel("        ");
        this.jlabel_7.setFont(new Font("Tahoma", Font.BOLD, 80));
        this.jlabel_7.setBackground(new Color(0, 128, 64));

        this.dictionaryView.contentPane.add(jlabel_7, BorderLayout.NORTH);
        this.dictionaryView.contentPane.add(jlabel_6, BorderLayout.EAST);
        this.dictionaryView.contentPane.add(jlabel_5, BorderLayout.WEST);
        this.dictionaryView.contentPane.add(jlabel_4, BorderLayout.SOUTH);
        this.dictionaryView.contentPane.add(jpanel_DangNhap, BorderLayout.CENTER);
    }

    public boolean checkDangNhap(){
        String tenAdmin = this.jtextField_tenDangNhap.getText();
        String matKhau = this.jtextField_matKhau.getText();
        this.adminModel.adminModelList = this.adminModel.setAdminModelList();
        for(int i = 0; i<adminModel.adminModelList.size(); i++){
            AdminModel admin = adminModel.adminModelList.get(i);

            // Kiểm tra xem tenAdmin và matKhau có khớp không
            if (tenAdmin.equals(admin.getTenDangNhap()) && matKhau.equals(admin.getMatKhau())) {
                return true; // Đăng nhập thành công
            }
        }
        return false;
    }
    public void selectAdmin() {
        this.dictionaryView.clearPanel();
        this.dictionaryView.setColorTool(this.dictionaryView.change);
        this.dictionaryView.change = "Admin";
        this.dictionaryView.jmenu_item_Admin.setForeground(new Color(64, 0, 128));
        this.dictionaryView.jpanel_Admin.setBackground(new Color(154,205,50));

        dangNhap();

        // Cập nhật lại giao diện
        this.dictionaryView.contentPane.revalidate();
        this.dictionaryView.contentPane.repaint();

    }

    public void adminTool(){
        this.dictionaryView.clearPanel();
        JPanel jpanel_adminTool_displayUserInfor = new JPanel(new FlowLayout());
        jpanel_adminTool_displayUserInfor.setBackground(new Color(250,128,114));
        JMenuItem jmenuItem_displayUserInfor = new JMenuItem("UserInfor");
        jmenuItem_displayUserInfor.setFont(new Font("Tahoma", Font.BOLD, 20));
        jmenuItem_displayUserInfor.setIcon(new ImageIcon("src\\view\\image\\user.png"));
        jpanel_adminTool_displayUserInfor.add(jmenuItem_displayUserInfor);

        //Display Document  displayDocument
        JPanel jpanel_adminTool_displayDocument = new JPanel(new FlowLayout());
        jpanel_adminTool_displayDocument.setBackground(new Color(173,216,230));
        JMenuItem jmenuItem_displayDocument = new JMenuItem("Document");
        jmenuItem_displayDocument.setFont(new Font("Tahoma", Font.BOLD, 20));
        jmenuItem_displayDocument.setIcon(new ImageIcon("src\\view\\image\\document.png"));
        jpanel_adminTool_displayDocument.add(jmenuItem_displayDocument);

        // Add User  addUser
        JPanel jpanel_adminTool_addUser = new JPanel(new FlowLayout());
        jpanel_adminTool_addUser.setBackground(new Color(144,238,144));
        JMenuItem jmenuItem_addUser = new JMenuItem("Add User");
        jmenuItem_addUser.setFont(new Font("Tahoma", Font.BOLD, 20));
        jpanel_adminTool_addUser.add(jmenuItem_addUser);

        //Borrow Document  borrowDocument
        JPanel jpanel_adminTool_borrowDocument = new JPanel(new FlowLayout());
        jpanel_adminTool_borrowDocument.setBackground(new Color(192,192,192));
        JMenuItem jmenuItem_borrowDocument = new JMenuItem("Borrow Document");
        jmenuItem_borrowDocument.setFont(new Font("Tahoma", Font.BOLD, 20));
        jpanel_adminTool_borrowDocument.add(jmenuItem_borrowDocument);

        //Remove Document removeDocument
        JPanel jpanel_adminTool_removeDocument = new JPanel(new FlowLayout());
        jpanel_adminTool_removeDocument.setBackground(new Color(192,192,192));
        JMenuItem jmenuItem_removeDocument = new JMenuItem("Add User");
        jmenuItem_removeDocument.setFont(new Font("Tahoma", Font.BOLD, 20));
        jpanel_adminTool_removeDocument.add(jmenuItem_removeDocument);

        JPanel jpanel_adminTool = new JPanel(new GridLayout(1, 7, 10, 10));
        jpanel_adminTool.setBackground(new Color(208, 255, 208));
        jpanel_adminTool.add(jpanel_adminTool_displayUserInfor);
        jpanel_adminTool.add(jpanel_adminTool_displayDocument);
        jpanel_adminTool.add(jpanel_adminTool_addUser);
        jpanel_adminTool.add(jpanel_adminTool_borrowDocument);
        jpanel_adminTool.add(jpanel_adminTool_removeDocument);

        JPanel jpanel_admin_contenPane = new JPanel(new BorderLayout());
        jpanel_admin_contenPane.setBackground(new Color(208, 255, 208));

        this.dictionaryView.contentPane.add(jpanel_adminTool, BorderLayout.NORTH);
        this.dictionaryView.contentPane.add(jpanel_admin_contenPane, BorderLayout.CENTER);
        this.dictionaryView.contentPane.revalidate();
        this.dictionaryView.contentPane.repaint();


    }

}
