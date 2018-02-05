package com.example.ethannguyen.csc548;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity
{
    private TextView BitTV;
    private TextView ByteTV;
    private TextView KiloBitTV;
    private TextView KiloByteTV;
    private TextView MegaBitTV;
    private TextView MegaByteTV;
    private TextView GigaBitTV;
    private TextView GigaByteTV;
    private TextView TeraBitTV;
    private TextView TeraByteTV;
    private EditText mbET;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.mbET= (EditText)this.findViewById(R.id.mbET);

        this.BitTV = (TextView)this.findViewById(R.id.BitTV);
        this.ByteTV = (TextView)this.findViewById(R.id.ByteTV);

        this.KiloBitTV = (TextView)this.findViewById(R.id.KiloBitTV);
        this.KiloByteTV = (TextView)this.findViewById(R.id.KiloByteTV);

        this.MegaBitTV = (TextView)this.findViewById(R.id.MegaBitTV);
        this.MegaByteTV = (TextView)this.findViewById(R.id.MegaByteTV);

        this.GigaBitTV = (TextView)this.findViewById(R.id.GigaBitTV);
        this.GigaByteTV = (TextView)this.findViewById(R.id.GigaByteTV);

        this.TeraBitTV = (TextView)this.findViewById(R.id.TeraBitTV);
        this.TeraByteTV = (TextView)this.findViewById(R.id.TeraByteTV);



    }

    public void converterButton (View v)
    {
        converterFunction();
    }

void converterFunction()
{
    DecimalFormat myFormatter = new DecimalFormat("##.##################");
    String inputString = this.mbET.getText().toString();
    double inputNum = Double.parseDouble(inputString);

    BitTV.setText(inputNum+"Megabyte = "+myFormatter.format(inputNum*1024*1024*8) +" Bits" );
    ByteTV.setText(inputNum+"Megabyte = "+myFormatter.format(inputNum*1024*1024) +" Bytes" );

    KiloBitTV.setText(inputNum+"Megabyte = "+myFormatter.format(inputNum*1024*8) +" KiloBits" );
    KiloByteTV.setText(inputNum+"Megabyte = "+myFormatter.format(inputNum*1024) +" KiloBytes" );

    MegaBitTV.setText(inputNum+"Megabyte = "+myFormatter.format(inputNum*8) +" Megabits" );
    MegaByteTV.setText(inputNum+"Megabyte = "+myFormatter.format(inputNum) +" Megabytes" );//same as input

    GigaBitTV.setText(inputNum+"Megabyte = "+myFormatter.format(inputNum / 1024 / 8) +" GigaBits" );
    GigaByteTV.setText(inputNum+"Megabyte = "+myFormatter.format(inputNum / 1024) +" GigaBytes" );

    TeraBitTV.setText(inputNum+"Megabyte = "+myFormatter.format(inputNum / 1024 / 1024 / 8) +" TeraBits" );
    TeraByteTV.setText(inputNum+"Megabyte = "+myFormatter.format(inputNum / 1024 / 1024) +" TeraBytes" );
}


}
