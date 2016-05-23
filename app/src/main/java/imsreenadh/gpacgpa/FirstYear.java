package imsreenadh.gpacgpa;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

public class FirstYear extends AppCompatActivity {

    Spinner sp1101,
            sp1102,
            sp1103,
            sp1104,
            sp1105,
            sp1106,
            sp1107,
            sp1108,
            sp1109,
            sp11L1,
            sp11L2,
            sp11L3;
    String selectedGrade1101,
            selectedGrade1102,
            selectedGrade1103,
            selectedGrade1104,
            selectedGrade1105,
            selectedGrade1106,
            selectedGrade1107,
            selectedGrade1108,
            selectedGrade1109,
            selectedGrade11L1,
            selectedGrade11L2,
            selectedGrade11L3;
    int gp1101,
            gp1102,
            gp1103,
            gp1104,
            gp1105,
            gp1106,
            gp1107,
            gp1108,
            gp1109,
            gp11L1,
            gp11L2,
            gp11L3;

    int gpa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_year);
        sp1101 = (Spinner) findViewById(R.id.spinner1101);
        sp1101.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapter, View v,
                                       int position, long id) {
                // On selecting a spinner item
                selectedGrade1101 = adapter.getItemAtPosition(position).toString();
                gp1101 = setGradePoint(selectedGrade1101);
                //gradeToaster(selectedGrade1101);
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }
        });

        sp1102 = (Spinner) findViewById(R.id.spinner1102);
        sp1102.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapter, View v,
                                       int position, long id) {
                // On selecting a spinner item
                selectedGrade1102 = adapter.getItemAtPosition(position).toString();
                gp1102 = setGradePoint(selectedGrade1102);
                //gradeToaster(selectedGrade1102);

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }
        });

        sp1103 = (Spinner) findViewById(R.id.spinner1103);
        sp1103.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapter, View v,
                                       int position, long id) {
                // On selecting a spinner item
                selectedGrade1103 = adapter.getItemAtPosition(position).toString();
                gp1103 = setGradePoint(selectedGrade1103);
                //gradeToaster(selectedGrade1103);

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }
        });

        sp1104 = (Spinner) findViewById(R.id.spinner1104);
        sp1104.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapter, View v,
                                       int position, long id) {
                // On selecting a spinner item
                selectedGrade1104 = adapter.getItemAtPosition(position).toString();
                gp1104 = setGradePoint(selectedGrade1104);
                //gradeToaster(selectedGrade1104);

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }
        });

        sp1105 = (Spinner) findViewById(R.id.spinner1105);
        sp1105.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapter, View v,
                                       int position, long id) {
                // On selecting a spinner item
                selectedGrade1105 = adapter.getItemAtPosition(position).toString();
                gp1105 = setGradePoint(selectedGrade1105);
                //gradeToaster(selectedGrade1105);

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }
        });

        sp1106 = (Spinner) findViewById(R.id.spinner1106);
        sp1106.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapter, View v,
                                       int position, long id) {
                // On selecting a spinner item
                selectedGrade1106 = adapter.getItemAtPosition(position).toString();
                gp1106 = setGradePoint(selectedGrade1106);
                //gradeToaster(selectedGrade1106);

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }
        });

        sp1107 = (Spinner) findViewById(R.id.spinner1107);
        sp1107.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapter, View v,
                                       int position, long id) {
                // On selecting a spinner item
                selectedGrade1107 = adapter.getItemAtPosition(position).toString();
                gp1107 = setGradePoint(selectedGrade1107);
                //gradeToaster(selectedGrade1107);

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }
        });

        sp1108 = (Spinner) findViewById(R.id.spinner1108);
        sp1108.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapter, View v,
                                       int position, long id) {
                // On selecting a spinner item
                selectedGrade1108 = adapter.getItemAtPosition(position).toString();
                gp1108 = setGradePoint(selectedGrade1108);
                //gradeToaster(selectedGrade1108);

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }
        });

        sp1109 = (Spinner) findViewById(R.id.spinner1109);
        sp1109.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapter, View v,
                                       int position, long id) {
                // On selecting a spinner item
                selectedGrade1109 = adapter.getItemAtPosition(position).toString();
                gp1109 = setGradePoint(selectedGrade1109);
                //gradeToaster(selectedGrade1109);

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }
        });

        sp11L1 = (Spinner) findViewById(R.id.spinner11L1);
        sp11L1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapter, View v,
                                       int position, long id) {
                // On selecting a spinner item
                selectedGrade11L1 = adapter.getItemAtPosition(position).toString();
                gp11L1 = setGradePoint(selectedGrade11L1);
                //gradeToaster(selectedGrade11L1);

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }
        });

        sp11L2 = (Spinner) findViewById(R.id.spinner11L2);
        sp11L2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapter, View v,
                                       int position, long id) {
                // On selecting a spinner item
                selectedGrade11L2 = adapter.getItemAtPosition(position).toString();
                gp11L2 = setGradePoint(selectedGrade11L2);
                //gradeToaster(selectedGrade11L2);

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }
        });

        sp11L3 = (Spinner) findViewById(R.id.spinner11L3);
        sp11L3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapter, View v,
                                       int position, long id) {
                // On selecting a spinner item
                selectedGrade11L3 = adapter.getItemAtPosition(position).toString();
                gp11L3 = setGradePoint(selectedGrade11L3);
                //gradeToaster(selectedGrade11L3);

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }
        });
    }

    private void gradeToaster(String grade) {
        Toast.makeText(getApplicationContext(),
                "Selected grade : " + grade, Toast.LENGTH_SHORT).show();
    }

    private int setGradePoint(String gradeToSet) {

        /*Set grade points
         * S = 10
         * A = 9
         * B = 8
         * C = 7
         * D = 6
         * F = 0
         */
        switch (gradeToSet) {
            case "S":
                return 10;
            case "A":
                return 9;
            case "B":
                return 8;
            case "C":
                return 7;
            case "D":
                return 6;
            case "F":
                return 0;
            default:
                return 0;
        }
    }

    public void calculateGPA(View view) {

        gpa = ((gp1101 * 4)
                + (gp1102 * 4)
                + (gp1103 * 4)
                + (gp1104 * 5)
                + (gp1105 * 5)
                + (gp1106 * 4)
                + (gp1107 * 4)
                + (gp1108 * 4)
                + (gp1109 * 3)
                + (gp11L1 * 4)
                + (gp11L2 * 2)
                + (gp11L3 * 1))
                / (44);

        /*Toast.makeText(getApplicationContext(),
                "GPA is: " + gpa, Toast.LENGTH_LONG).show();*/

        new AlertDialog.Builder(this)
                .setTitle("SEMESTER I&II GPA")
                .setMessage("Your GPA for First Year is : " + gpa + "\n\nReturn back home?")
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface dialog, int whichButton) {
                        FirstYear.super.onBackPressed();
                    }
                })
                .setNegativeButton(android.R.string.no, null)
                .setCancelable(false)
                .show();
    }

    public void cancelButtonClicked(View view) {
        FirstYear.super.onBackPressed();
    }
}
