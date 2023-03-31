package Semester4;

//import sonihendarkuliah.*;
//import KuisAdaScore.*;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author montox
 */
public class UTS_Pemgrograman_Lanjut_4B extends javax.swing.JFrame {

    //daftar soal dan jawaban dalam bentuk Array
    String[] NoxTanya = {
        "SOAL 1: DBMS adalah singkatan dari...",
        "SOAL 2: Dibawah ini adalah tujuan atau manfaat penggunaan DBMS, Kecuali...",
        "SOAL 3: Berikut ini contoh DBMS, Kecuali...",
        "SOAL 4: Kepanjangan dari SQL adalah...",
        "SOAL 5: Perintah untuk membuat database adalah...",
        "Soal 6: Perintah untuk membuat tabel baru di dalam sebuah database adalah..",
        "SOAL 7: Perintah untuk menghapus data di database adalah...",
        "SOAL 8: Perintah yang digunakan untuk menambah data baru adalah...",
        "SOAL 9: Berikut adalah perintah yang benar untuk menambah data ke dalam tabel siswa...",
        "SOAL 10: Berikut adalah perintah untuk menampilkan kolom nama dari tabel siswa",
        "SOAL 11: Untuk membuat suatu kondisi menggunakan pernyataan?",
        "SOAL 12: Berikut perintah SQL untuk menampilkan kolom nama pada tabel siswa yang nilainya diakhiri dengan kata 'Adi'",
        "SOAL 13: Kata Kunci untuk mengurutkan (sort) hasil query adalah",
        "SOAL 14: Kata kunci untuk mengurutkan hasil query secara Ascending (urutan dari terkecil ke besar) adalah",
        "SOAL 15: Perintah untuk update nama siswa pada kolom nama di tabel siswa dari yang sebelumnya bernama ‘Rini’ menjadi ‘Tuti’",
        "SOAL 16: Perintah SQL untuk menghitung seluruh record di dalam tabel di database adalah",
        "SOAL 17: Untuk membuat relasi atau hubungan antar tabel menggunakan perintah",
        "SOAL 18: Berikut adalah operator yang digunakan untuk memilih nilai dalam rentang tertentu",
        "SOAL 19: Perintah SQL yang digunakan untuk memberikan hak akses atau izin pada user di database adalah",
        "SOAL 20: Ciri-ciri field yang paling cocok untuk digunakan sebagai primary key (kunci utama) adalah"
    };
    String[] NoxA = {
        "Data Manipulation System",
        "Akses data lebih mudah dan cepat",
        "MySQL",
        "Structured Question Language",
        "CREATE DATABASE",
        "CREATE BASE",
        "REMOVE",
        "ADD NEW",
        "INSERT INTO siswa VALUES (‘Dimas’,’Rini’);",
        "SELECT nama FROM siswa",
        "SELECT",
        "SELECT ... WHERE nama LIKE ‘%Adi’",
        "ORDER BY",
        "ASC",
        "UPDATED...SET nama=’Tuti’ WHERE nama=’Rini’",
        "LEN (*)",
        "LAST JOINING",
        "JOIN",
        "GRANT",
        "Bersifat umum dan go public"
    };
    String[] NoxB = {
        "Database Manipulation Social",
        "Dapat menangani data-data dalam jumlah besar",
        "PostgreSQL",
        "Strong Question Language",
        "CREATE STORE PROC",
        "CREATE TABLE",
        "SAVE AS",
        "INSERT INTO",
        "INSERT NEW (‘Dimas’,’Rini’) INTO siswa",
        "EXTRACT nama FROM siswa",
        "FROM",
        "GET ... WHERE nama LIKE ‘Adi%’",
        "SORT BY",
        "DESC",
        "MODIFY...SET nama=’Tuti’ WHERE nama=’Rini’",
        "COUNT(*)",
        "INNER JOIN",
        "WITHIN",
        "REVOKE",
        "Bersifat unik"
    };
    String[] NoxC = {
        "Data Manajer System",
        "Membuat pekerjaan menjadi kompleks",
        "Oracle",
        "Structured Query Language",
        "CREATE DB",
        "CREATE VIEW",
        "DELETE",
        "INSERT NEW",
        "ADD INTO siswa VALUES (‘Dimas’,’Rini’);",
        "DELETE nama FROM siswa",
        "WHERE",
        "DELETE ... WHERE nama LIKE ‘*Adi’",
        "ORDERING",
        "RISE",
        "UPDATING nama=’Tuti’ WHERE nama=’Rini’",
        "DISTINCT (*)",
        "JOINED",
        "RANGE",
        "DISTINCT",
        "Mudah di ingat dan ngetrend"
    };
    String[] NoxD = {
        "Database Management System",
        "Menghilangkan hasil duplikasi/inkonsistensi data",
        "Excel",
        "Strong Query Language",
        "CREATE DATABASE TABLE",
        "CREATE TAB",
        "MODIFY",
        "ADD INTO",
        "SELECT siswa VALUES (‘Dimas’,’Rini’)",
        "SHOW nama FROM siswa",
        "ORDER BY",
        "RENAME ... WHERE nama LIKE ‘Adi’",
        "SORTING",
        "ASCEND",
        "UPDATE...SET nama='Tuti' WHERE nama='Rini'",
        "ROW(*)",
        "INSIDE JOIN",
        "BETWEEN",
        "AUTO_INCREMENT",
        "Memiliki kesamaan/duplikasi dengan yang lain"
    };
    String[] NoxJWB = {
        "d",
        "c",
        "d",
        "c",
        "a",
        "b",
        "c",
        "b",
        "a",
        "a",
        "c",
        "a",
        "a",
        "a",
        "d",
        "b",
        "b",
        "d",
        "a",
        "b"
    };

    int index = 0, Nbetul = 0, Nsalah = 0; //Nbetul dan Nsalah untuk menghitung jumlah betul salah

    /**
     * Creates new form Tugas3_SoalPilihanGanda
     */
    public UTS_Pemgrograman_Lanjut_4B() {
        initComponents();

        this.setResizable(false); // agar windows tidak bisa di perbesar (Maximize / Non Sizeable)

        // Agar posisi windows di tengah layar, mengambil ukuran layar, butuh import java.awt.*;
        Dimension layar = Toolkit.getDefaultToolkit().getScreenSize();

        // Agar posisi windows di tengah layar, membuat titik x dan y
        int x = layar.width / 2 - this.getSize().width / 2;
        int y = layar.height / 2 - this.getSize().height / 2;
        this.setLocation(x, y);

        muncul(0);
        NoxButtonPrev_.setVisible(false); //agar tombol Prev hilang dari layar awal
        NoxButtonFinish_.setVisible(false); //agar tombol Finish hilang dari layar awal
        NoxButtonEXIT_.setVisible(false); //agar tombol EXIT hilang dari layar awal
    }
    
    public void aktifkan_tombol(boolean yes_or_no)
    {
        NoxButtonA_.setEnabled(yes_or_no);
        NoxButtonB_.setEnabled(yes_or_no);
        NoxButtonC_.setEnabled(yes_or_no);
        NoxButtonD_.setEnabled(yes_or_no);
    }
    
    public void telah_dipilih(JButton rbtn)
    {
        aktifkan_tombol(false);
    }
    
    public void soal_baru(JButton rbtn)
    {
        aktifkan_tombol(true);
    }

    public void muncul(int i) {
        NoxFieldPertanyaan_.setText(NoxTanya[i]);
        NoxButtonA_.setText("A.  " + NoxA[i]);
        NoxButtonB_.setText("B.  " + NoxB[i]);
        NoxButtonC_.setText("C.  " + NoxC[i]);
        NoxButtonD_.setText("D.  " + NoxD[i]);
    }

    public void Cek_NoxJWB(String m) {
        if (m.equals(NoxJWB[index])) {
            JOptionPane.showMessageDialog(rootPane, "BENAR");
            Nbetul++; //kalo jawaban betul maka nilai betul +1
        } else {
            JOptionPane.showMessageDialog(rootPane, "Jawaban kamu SALAH !!!", "SALAH", HEIGHT);
            Nsalah++; //kalo jawaban salah makan niala salah +1
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        TextPertanyaanKe_ = new javax.swing.JLabel();
        TextPilihJawaban_ = new javax.swing.JLabel();
        NoxButtonA_ = new javax.swing.JButton();
        NoxButtonB_ = new javax.swing.JButton();
        NoxButtonC_ = new javax.swing.JButton();
        NoxButtonD_ = new javax.swing.JButton();
        NoxButtonPrev_ = new javax.swing.JButton();
        NoxButtonNext_ = new javax.swing.JButton();
        NoxAbout = new javax.swing.JButton();
        NoxButtonFinish_ = new javax.swing.JButton();
        NoxButtonEXIT_ = new javax.swing.JButton();
        TextPilihJawaban_1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        NoxFieldPertanyaan_ = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Soni H -- UTS Pemrograman Lanjut 4B");

        jLabel1.setBackground(new java.awt.Color(51, 255, 153));
        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Materi DBMS - MySQL");

        TextPertanyaanKe_.setFont(new java.awt.Font("Liberation Sans", 3, 14)); // NOI18N
        TextPertanyaanKe_.setText("Pertanyaan Ke:");

        TextPilihJawaban_.setFont(new java.awt.Font("Liberation Sans", 3, 14)); // NOI18N
        TextPilihJawaban_.setText("Pilih Jawaban:");

        NoxButtonA_.setFont(new java.awt.Font("Liberation Sans", 3, 12)); // NOI18N
        NoxButtonA_.setText("A");
        NoxButtonA_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                NoxButtonA_MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                NoxButtonA_MouseReleased(evt);
            }
        });
        NoxButtonA_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoxButtonA_ActionPerformed(evt);
            }
        });

        NoxButtonB_.setFont(new java.awt.Font("Liberation Sans", 3, 12)); // NOI18N
        NoxButtonB_.setText("B");
        NoxButtonB_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                NoxButtonB_MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                NoxButtonB_MouseReleased(evt);
            }
        });
        NoxButtonB_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoxButtonB_ActionPerformed(evt);
            }
        });

        NoxButtonC_.setFont(new java.awt.Font("Liberation Sans", 3, 12)); // NOI18N
        NoxButtonC_.setText("C");
        NoxButtonC_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                NoxButtonC_MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                NoxButtonC_MouseReleased(evt);
            }
        });
        NoxButtonC_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoxButtonC_ActionPerformed(evt);
            }
        });

        NoxButtonD_.setFont(new java.awt.Font("Liberation Sans", 3, 12)); // NOI18N
        NoxButtonD_.setText("D");
        NoxButtonD_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                NoxButtonD_MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                NoxButtonD_MouseReleased(evt);
            }
        });
        NoxButtonD_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoxButtonD_ActionPerformed(evt);
            }
        });

        NoxButtonPrev_.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        NoxButtonPrev_.setText("Prev");
        NoxButtonPrev_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NoxButtonPrev_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NoxButtonPrev_MouseExited(evt);
            }
        });
        NoxButtonPrev_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoxButtonPrev_ActionPerformed(evt);
            }
        });

        NoxButtonNext_.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        NoxButtonNext_.setText("Next");
        NoxButtonNext_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NoxButtonNext_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NoxButtonNext_MouseExited(evt);
            }
        });
        NoxButtonNext_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoxButtonNext_ActionPerformed(evt);
            }
        });

        NoxAbout.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        NoxAbout.setText("?");
        NoxAbout.setToolTipText("Readme");
        NoxAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoxAboutActionPerformed(evt);
            }
        });

        NoxButtonFinish_.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        NoxButtonFinish_.setText("Finish");
        NoxButtonFinish_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NoxButtonFinish_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NoxButtonFinish_MouseExited(evt);
            }
        });
        NoxButtonFinish_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoxButtonFinish_ActionPerformed(evt);
            }
        });

        NoxButtonEXIT_.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        NoxButtonEXIT_.setText("EXIT");
        NoxButtonEXIT_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NoxButtonEXIT_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NoxButtonEXIT_MouseExited(evt);
            }
        });
        NoxButtonEXIT_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoxButtonEXIT_ActionPerformed(evt);
            }
        });

        TextPilihJawaban_1.setFont(new java.awt.Font("Liberation Sans", 3, 14)); // NOI18N
        TextPilihJawaban_1.setText("v3");

        NoxFieldPertanyaan_.setEditable(false);
        NoxFieldPertanyaan_.setColumns(20);
        NoxFieldPertanyaan_.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        NoxFieldPertanyaan_.setLineWrap(true);
        NoxFieldPertanyaan_.setRows(5);
        NoxFieldPertanyaan_.setText("TextPertanyaan");
        jScrollPane1.setViewportView(NoxFieldPertanyaan_);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jSeparator1))
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TextPertanyaanKe_)
                                    .addComponent(TextPilihJawaban_))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NoxButtonA_, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NoxButtonB_, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(NoxButtonEXIT_, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NoxButtonPrev_, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NoxButtonC_, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NoxButtonD_, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(NoxButtonNext_, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NoxButtonFinish_, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(40, 40, 40))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TextPilihJawaban_1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(NoxAbout)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextPertanyaanKe_)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TextPilihJawaban_)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NoxButtonA_, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(NoxButtonB_, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(NoxButtonC_, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(NoxButtonD_, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NoxButtonPrev_)
                    .addComponent(NoxButtonNext_)
                    .addComponent(NoxButtonFinish_)
                    .addComponent(NoxButtonEXIT_))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NoxAbout)
                    .addComponent(TextPilihJawaban_1)))
        );

        setSize(new java.awt.Dimension(801, 509));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
/**
    private static final String STR_NEWLINE = "<br />";
    private FontRenderContext fontRenderContext = new FontRenderContext(new AffineTransform(), true, true);

    private String getWrappedText(Graphics graphics, AbstractButton button, String str) {
        if (str != null) {
            String text = str.replaceAll("<html><center>", "").replaceAll("</center></html>", "");
            int width = button.getWidth();
            Rectangle2D stringBounds = button.getFont().getStringBounds(text, fontRenderContext);
            if (!str.contains(STR_NEWLINE) && (width - 5) < ((Double) stringBounds.getWidth()).intValue()) {
                String newStr;
                if (str.contains(" ")) {
                    int lastIndex = str.lastIndexOf(" ");
                    newStr = str.substring(0, lastIndex) + STR_NEWLINE + str.substring(lastIndex);
                } else {
                    int strLength = ((str.length() / 3) * 2);
                    newStr = str.substring(0, strLength) + STR_NEWLINE + str.substring(strLength);
                }
                return newStr;
            }
        }
        return str;
    }
**/

    private void NoxButtonA_MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NoxButtonA_MousePressed
        // Tombol berubah warna ketika di klik
        NoxButtonA_.setBackground(Color.red);
    }//GEN-LAST:event_NoxButtonA_MousePressed

    private void NoxButtonA_MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NoxButtonA_MouseReleased
        // Tombol berubah warna ketika klik di lepas
        NoxButtonA_.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_NoxButtonA_MouseReleased

    private void NoxButtonB_MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NoxButtonB_MouseReleased
        // Tombol berubah warna ketika klik di lepas
        NoxButtonB_.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_NoxButtonB_MouseReleased

    private void NoxButtonC_MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NoxButtonC_MouseReleased
        // Tombol berubah warna ketika klik di lepas
        NoxButtonC_.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_NoxButtonC_MouseReleased

    private void NoxButtonD_MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NoxButtonD_MouseReleased
        // Tombol berubah warna ketika klik di lepas
        NoxButtonD_.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_NoxButtonD_MouseReleased

    private void NoxButtonD_MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NoxButtonD_MousePressed
        // Tombol berubah warna ketika di klik
        NoxButtonD_.setBackground(Color.red);
    }//GEN-LAST:event_NoxButtonD_MousePressed

    private void NoxButtonB_MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NoxButtonB_MousePressed
        // Tombol berubah warna ketika di klik
        NoxButtonB_.setBackground(Color.red);
    }//GEN-LAST:event_NoxButtonB_MousePressed

    private void NoxButtonC_MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NoxButtonC_MousePressed
        // Tombol berubah warna ketika di klik
        NoxButtonC_.setBackground(Color.red);
    }//GEN-LAST:event_NoxButtonC_MousePressed

    private void NoxButtonNext_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NoxButtonNext_MouseEntered
        // Tombol berubah warna ketika Cursor berada diatas tombol (Mouse Over)
        NoxButtonNext_.setBackground(Color.BLUE);
    }//GEN-LAST:event_NoxButtonNext_MouseEntered

    private void NoxButtonNext_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NoxButtonNext_MouseExited
        // Tombol berubah warna ketika Cursor keluar dari area tombol (Mouse Out)
        NoxButtonNext_.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_NoxButtonNext_MouseExited

    private void NoxButtonPrev_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NoxButtonPrev_MouseEntered
        // Tombol berubah warna ketika Cursor berada diatas tombol (Mouse Over)
        NoxButtonPrev_.setBackground(Color.BLUE);
    }//GEN-LAST:event_NoxButtonPrev_MouseEntered

    private void NoxButtonPrev_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NoxButtonPrev_MouseExited
        // Tombol berubah warna ketika Cursor keluar dari area tombol (Mouse Out)
        NoxButtonPrev_.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_NoxButtonPrev_MouseExited

    private void NoxButtonA_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoxButtonA_ActionPerformed
        // TODO add your handling code here:
        Cek_NoxJWB("a");
        telah_dipilih(NoxButtonA_);
    }//GEN-LAST:event_NoxButtonA_ActionPerformed

    private void NoxButtonB_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoxButtonB_ActionPerformed
        // TODO add your handling code here:
        Cek_NoxJWB("b");
        telah_dipilih(NoxButtonB_);
    }//GEN-LAST:event_NoxButtonB_ActionPerformed

    private void NoxButtonC_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoxButtonC_ActionPerformed
        // TODO add your handling code here:
        Cek_NoxJWB("c");
        telah_dipilih(NoxButtonC_);
    }//GEN-LAST:event_NoxButtonC_ActionPerformed

    private void NoxButtonD_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoxButtonD_ActionPerformed
        // TODO add your handling code here:
        Cek_NoxJWB("d");
        telah_dipilih(NoxButtonD_);
    }//GEN-LAST:event_NoxButtonD_ActionPerformed

    private void NoxButtonNext_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoxButtonNext_ActionPerformed
        // TODO add your handling code here:
        index++;
        muncul(index);
        aktifkan_tombol(true);

        if (index == 1) {
            NoxButtonPrev_.setVisible(true);
        }
        if (index == 19) {
            NoxButtonNext_.setVisible(false);
            NoxButtonFinish_.setVisible(true);
        } else {
            NoxButtonNext_.setVisible(true);
            //NoxButtonFinish_.setVisible(false);
        }
    }//GEN-LAST:event_NoxButtonNext_ActionPerformed

    private void NoxButtonPrev_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoxButtonPrev_ActionPerformed
        // TODO add your handling code here:
        index--;
        muncul(index);

        if (index == 0) {
            NoxButtonPrev_.setVisible(false);
        } else {
            NoxButtonPrev_.setVisible(true);
            NoxButtonNext_.setVisible(true);
            NoxButtonFinish_.setVisible(false);
        }
    }//GEN-LAST:event_NoxButtonPrev_ActionPerformed

    private void NoxAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoxAboutActionPerformed
        // TODO add your handling code here:
        new Readme().setVisible(true);
        
        /**
        JOptionPane.showMessageDialog(rootPane, "UTS Matkul Pemgorgraman JAVA Lanjut \n"
                + "PTI 4B \n"
                + "Soni Hendarkanto \n\n"
                + "UTS Membuat Program Soal Pilihan Ganda Sederhana v3 \n"
                + "Kamis 30 Maret 2023 \n\n"
                + "Penambahan pada munculnya Nilai / Score \n"
                + "Hanya bisa copas dan (sangat) sedikit modif dari coding yg ditunjukkan oleh pak dosen Rozi \n\n"
                + "---One Piece Fans---", "Tentang Program ini", HEIGHT);
                * **/
    }//GEN-LAST:event_NoxAboutActionPerformed

    private void NoxButtonFinish_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NoxButtonFinish_MouseEntered
        // TODO add your handling code here:
        NoxButtonFinish_.setBackground(Color.ORANGE);
    }//GEN-LAST:event_NoxButtonFinish_MouseEntered

    private void NoxButtonFinish_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NoxButtonFinish_MouseExited
        // TODO add your handling code here:
        NoxButtonFinish_.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_NoxButtonFinish_MouseExited

    private void NoxButtonFinish_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoxButtonFinish_ActionPerformed
        // TODO add your handling code here:
        NoxFieldPertanyaan_.setText("Jawaban Betul: " + Nbetul + "   /   Jawaban Salah: " + Nsalah);
        NoxFieldPertanyaan_.setBackground(Color.PINK);
        NoxButtonA_.setText("SCORE !!!");
        NoxButtonB_.setText("SCORE !!!");
        NoxButtonC_.setText("SCORE !!!");
        NoxButtonD_.setText("SCORE !!!");
        NoxButtonPrev_.setVisible(false);
        NoxButtonFinish_.setVisible(false);
        NoxButtonA_.setEnabled(false);
        NoxButtonB_.setEnabled(false);
        NoxButtonC_.setEnabled(false);
        NoxButtonD_.setEnabled(false);
        TextPertanyaanKe_.setText("Score Nilai anda adalah:");
        TextPilihJawaban_.setText("Terima kasih atas partisipasinya....");
        NoxButtonEXIT_.setVisible(true);
    }//GEN-LAST:event_NoxButtonFinish_ActionPerformed

    private void NoxButtonEXIT_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NoxButtonEXIT_MouseEntered
        // TODO add your handling code here:
        NoxButtonEXIT_.setBackground(Color.PINK);
    }//GEN-LAST:event_NoxButtonEXIT_MouseEntered

    private void NoxButtonEXIT_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NoxButtonEXIT_MouseExited
        // TODO add your handling code here:
        NoxButtonEXIT_.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_NoxButtonEXIT_MouseExited

    private void NoxButtonEXIT_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoxButtonEXIT_ActionPerformed
        // perintah untuk tombol exit keluar
        dispose();
    }//GEN-LAST:event_NoxButtonEXIT_ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UTS_Pemgrograman_Lanjut_4B.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UTS_Pemgrograman_Lanjut_4B.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UTS_Pemgrograman_Lanjut_4B.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UTS_Pemgrograman_Lanjut_4B.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UTS_Pemgrograman_Lanjut_4B().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton NoxAbout;
    private javax.swing.JButton NoxButtonA_;
    private javax.swing.JButton NoxButtonB_;
    private javax.swing.JButton NoxButtonC_;
    private javax.swing.JButton NoxButtonD_;
    private javax.swing.JButton NoxButtonEXIT_;
    private javax.swing.JButton NoxButtonFinish_;
    private javax.swing.JButton NoxButtonNext_;
    private javax.swing.JButton NoxButtonPrev_;
    private javax.swing.JTextArea NoxFieldPertanyaan_;
    private javax.swing.JLabel TextPertanyaanKe_;
    private javax.swing.JLabel TextPilihJawaban_;
    private javax.swing.JLabel TextPilihJawaban_1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
