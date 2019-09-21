package csejeonju2019.go.kr.insta;

import android.graphics.Color;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.pm10.library.CircleIndicator;

public class recommend5sadlock extends AppCompatActivity
        implements OnMapReadyCallback {


    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.recommend5sadlock);  //순서주의주의

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        Adapter5 adapter=new Adapter5(this);
        ViewPager viewPager=(ViewPager)findViewById(R.id.rec5);
        viewPager.setAdapter(adapter);


        viewPager.setCurrentItem(0);

        CircleIndicator circleIndicator1=(CircleIndicator)findViewById(R.id.circle_indicator);

        circleIndicator1.setupWithViewPager(viewPager);
    }


    @Override
    public void onMapReady(final GoogleMap googleMap) {


        mMap = googleMap;
        LatLng hanok = new LatLng(35.81514, 127.15393);

        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.position(hanok);
        markerOptions.title("전주한옥마을관광안내소");
        LatLng sori = new LatLng(35.81765, 127.15334);

        MarkerOptions markerOptions2 = new MarkerOptions();
        markerOptions2.position(sori);
        markerOptions2.title("전주소리문화관");
        LatLng kwang = new LatLng(35.81663, 127.1535);

        MarkerOptions markerOptions3 = new MarkerOptions();
        markerOptions3.position(kwang);
        markerOptions3.title("승광재민박");
        LatLng hanji = new LatLng(35.81577, 127.15369);

        MarkerOptions markerOptions4 = new MarkerOptions();
        markerOptions4.position(hanji);
        markerOptions4.title("전주전통한지원");

        LatLng ohmok = new LatLng(35.81405, 127.1545);

        MarkerOptions markerOptions5 = new MarkerOptions();
        markerOptions5.position(ohmok);
        markerOptions5.title("오목대");

        LatLng yeonsoo = new LatLng(35.81244, 127.15652);

        MarkerOptions markerOptions6 = new MarkerOptions();
        markerOptions6.position(yeonsoo);
        markerOptions6.title("전주전통문화연수원");

        LatLng hyangkyo = new LatLng(35.81285, 127.15712);

        MarkerOptions markerOptions7 = new MarkerOptions();
        markerOptions7.position(hyangkyo);
        markerOptions7.title("전주향교");

        LatLng hyangkyokil = new LatLng(35.8123, 127.15476);

        MarkerOptions markerOptions8 = new MarkerOptions();
        markerOptions8.position(hyangkyokil);
        markerOptions8.title("향교길");

        LatLng wanpan = new LatLng(35.8119, 127.15802);

        MarkerOptions markerOptions9 = new MarkerOptions();
        markerOptions9.position(wanpan);
        markerOptions9.title("완판본문화관");
        LatLng ohmokgil = new LatLng(35.81315, 127.154);

        MarkerOptions markerOptions10 = new MarkerOptions();
        markerOptions10.position(ohmokgil);
        markerOptions10.title("오목대길");
        LatLng taezo = new LatLng(35.81439, 127.15101);

        MarkerOptions markerOptions11 = new MarkerOptions();
        markerOptions11.position(taezo);
        markerOptions11.title("태조로");

        LatLng doldam = new LatLng(35.81599, 127.14875);

        MarkerOptions markerOptions12 = new MarkerOptions();
        markerOptions12.position(doldam);
        markerOptions12.title("돌담길");
        LatLng choi= new LatLng(35.81635, 127.15213);

        MarkerOptions markerOptions13 = new MarkerOptions();
        markerOptions13.position(choi);
        markerOptions13.title("최명희길");

        LatLng kimchi= new LatLng(35.81754, 127.15239);

        MarkerOptions markerOptions14 = new MarkerOptions();
        markerOptions14.position(kimchi);
        markerOptions14.title("전주김치문화관");

        mMap.addPolyline(new PolylineOptions().add(hanok,sori).width(5).color(Color.RED));
        mMap.addPolyline(new PolylineOptions().add(sori,kwang).width(5).color(Color.RED));
        mMap.addPolyline(new PolylineOptions().add(kwang,hanji).width(5).color(Color.RED));
        mMap.addPolyline(new PolylineOptions().add(hanji,ohmok).width(5).color(Color.RED));
        mMap.addPolyline(new PolylineOptions().add(ohmok,yeonsoo).width(5).color(Color.RED));
        mMap.addPolyline(new PolylineOptions().add(yeonsoo,hyangkyo).width(5).color(Color.RED));
        mMap.addPolyline(new PolylineOptions().add(hyangkyo,hyangkyokil).width(5).color(Color.RED));
        mMap.addPolyline(new PolylineOptions().add(hyangkyokil,wanpan).width(5).color(Color.RED));
        mMap.addPolyline(new PolylineOptions().add(wanpan,ohmokgil).width(5).color(Color.RED));
        mMap.addPolyline(new PolylineOptions().add(ohmokgil,taezo).width(5).color(Color.RED));
        mMap.addPolyline(new PolylineOptions().add(taezo,doldam).width(5).color(Color.RED));
        mMap.addPolyline(new PolylineOptions().add(doldam,choi).width(5).color(Color.RED));
        mMap.addPolyline(new PolylineOptions().add(choi,kimchi).width(5).color(Color.RED));
        mMap.addPolyline(new PolylineOptions().add(kimchi,hanok).width(5).color(Color.RED));




        mMap.addMarker(markerOptions);
        mMap.addMarker(markerOptions2);
        mMap.addMarker(markerOptions3);
        mMap.addMarker(markerOptions4);
        mMap.addMarker(markerOptions5);
        mMap.addMarker(markerOptions6);
        mMap.addMarker(markerOptions7);
        mMap.addMarker(markerOptions8);
        mMap.addMarker(markerOptions9);
        mMap.addMarker(markerOptions10);
        mMap.addMarker(markerOptions11);
        mMap.addMarker(markerOptions12);
        mMap.addMarker(markerOptions13); mMap.addMarker(markerOptions14);


        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(hanok, 16));//16배 줌가능
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(hanok, 14));//지도 시작시 애니메이션 효과
    }
}