package csejeonju2019.go.kr.insta;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Frag3 extends Fragment implements OnMapReadyCallback
{
    public double loc1,loc2;


    private MapView mapView = null;

    public Frag3()
    {
        // required
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.frag3, container, false);
        Button button=(Button)layout.findViewById(R.id.button_share);
        mapView = (MapView)layout.findViewById(R.id.map);
        mapView.getMapAsync(this);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String mySharedLink = "https://github.com/SophieYoonseo/Jeonju_culturallife/tree/master/junseong";
                String mySubject = "오픈소스로 초대합니덩.";

                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_SUBJECT, mySubject);
                intent.putExtra(Intent.EXTRA_TEXT, mySharedLink);

                startActivity(Intent.createChooser(intent, "공유합니다."));



            }
        });
        return layout;
    }

    @Override
    public void onStart() {
        super.onStart();
        mapView.onStart();
    }

    @Override
    public void onStop() {
        super.onStop();
        mapView.onStop();
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        mapView.onSaveInstanceState(outState);
    }

    @Override
    public void onResume() {
        super.onResume();
        mapView.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
        mapView.onPause();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        mapView.onLowMemory();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mapView.onLowMemory();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        //액티비티가 처음 생성될 때 실행되는 함수

        if(mapView != null)
        {
            mapView.onCreate(savedInstanceState);
        }
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        LatLng jeonju = new LatLng(35.846925, 127.129456);
        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.position(jeonju);
        markerOptions.title("전북대학교");
        markerOptions.snippet("전북의 하바드");
        googleMap.addMarker(markerOptions);
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(jeonju,16));//16배 줌가능
        googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(jeonju,16));//지도 시작시 애니메이션 효과

    }

}


