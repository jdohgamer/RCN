package com.dev.jdoh.rudolphchristmasnavigator;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.github.clans.fab.FloatingActionButton;
import com.github.clans.fab.FloatingActionMenu;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class NaviActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    FloatingActionMenu materialDesignFAM;
    FloatingActionButton floatingActionButton1, floatingActionButton2, floatingActionButton3, floatingActionButton4;
    public double lng = -97.0;
    LatLng myPosition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navi);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        materialDesignFAM = findViewById(R.id.material_design_android_floating_action_menu);
        floatingActionButton1 = findViewById(R.id.material_design_floating_action_menu_item1);
        floatingActionButton2 = findViewById(R.id.material_design_floating_action_menu_item2);
        floatingActionButton3 =  findViewById(R.id.material_design_floating_action_menu_item3);
       // floatingActionButton4 =  findViewById(R.id.material_design_floating_action_menu_item4);

        floatingActionButton1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //TODO something when floating action menu first item clicked
                lng = lng + .001;
                Toast.makeText(getApplicationContext(), "1", Toast.LENGTH_LONG).show();
                LatLng newPin = new LatLng(33.497251, lng);

                mMap.addMarker(new MarkerOptions().position(newPin).title("Star Trek"))
                        .setIcon(BitmapDescriptorFactory.fromResource(R.drawable.bulbmarker24));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(newPin));
                mMap.animateCamera(CameraUpdateFactory.zoomTo(15));

            }
        });
        floatingActionButton2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //TODO something when floating action menu second item clicked
//                if (ContextCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.ACCESS_FINE_LOCATION)
//                        == PackageManager.PERMISSION_GRANTED) {
//                    mMap.setMyLocationEnabled(true);
//
//                    // Getting LocationManager object from System Service LOCATION_SERVICE
//                    LocationManager locationManager = (LocationManager) getSystemService(LOCATION_SERVICE);
//                    Toast.makeText(getApplicationContext(),locationManager.toString(), Toast.LENGTH_LONG).show();
//
//                    // Creating a criteria object to retrieve provider
//                    Criteria criteria = new Criteria();
//
//                    // Getting the name of the best provider
//                    String provider = locationManager.getBestProvider(criteria, true);
//
//                    // Getting Current Location
//                    Location location = locationManager.getLastKnownLocation(provider);
//
//                    if (location != null) {
//                        // Getting latitude of the current location
//                        double latitude = location.getLatitude();
//
//                        // Getting longitude of the current location
//                        double longitude = location.getLongitude();
//
//                        // Creating a LatLng object for the current location
//                        LatLng latLng = new LatLng(latitude, longitude);
//
//                        myPosition = new LatLng(latitude, longitude);
//                        String TAG = null;
//                        Toast.makeText(getApplicationContext(),myPosition.toString(), Toast.LENGTH_LONG).show();
//
//                        mMap.addMarker(new MarkerOptions().position(myPosition).title("Start"));
//                    }
//                } else {
//                // Show rationale and request permission.
//                }

                LatLng scotty = new LatLng(33.497251, lng);

                mMap.addMarker(new MarkerOptions().position(scotty).title("Star Trek"))
                                                                    .setIcon(BitmapDescriptorFactory.fromResource(R.drawable.bulbmarker24));;
                mMap.moveCamera(CameraUpdateFactory.newLatLng(scotty));
                mMap.animateCamera(CameraUpdateFactory.zoomTo(15));






            }
        });
        floatingActionButton3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //TODO something when floating action menu third item clicked
                Toast.makeText(getApplicationContext(), "pew pew", Toast.LENGTH_LONG).show();
            }
        });

    }





    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;


        // Add a marker in Sydney and move the camer1a
        LatLng northPole = new LatLng(-77, 23);
        mMap.addMarker(new MarkerOptions().position(northPole).title("Hi Cin :)"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(northPole));

//        if (ContextCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.ACCESS_FINE_LOCATION)
//                == PackageManager.PERMISSION_GRANTED) {
//            mMap.setMyLocationEnabled(true);
//        } else {
//            // Show rationale and request permission.
//        }
//
//        // Getting LocationManager object from System Service LOCATION_SERVICE
//        LocationManager locationManager = (LocationManager) getSystemService(LOCATION_SERVICE);
//
//        // Creating a criteria object to retrieve provider
//        Criteria criteria = new Criteria();
//
//        // Getting the name of the best provider
//        String provider = locationManager.getBestProvider(criteria, true);
//
//        // Getting Current Location
//        Location location = locationManager.getLastKnownLocation(provider);
//
////            if (location != null) {
////                // Getting latitude of the current location
//        double latitude = location.getLatitude();
//
//                // Getting longitude of the current location
//        double longitude = location.getLongitude();
//
//                // Creating a LatLng object for the current location
//
//
//        myPosition = new LatLng(latitude, longitude);
//        mMap.addMarker(new MarkerOptions().position(myPosition).title("Start"));
//        mMap.moveCamera(CameraUpdateFactory.newLatLng(myPosition));

            }


    }

