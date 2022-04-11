package com.jake.android.skiresort

import androidx.fragment.app.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class FragmentMap : Fragment() {

    private val callback = OnMapReadyCallback { googleMap ->

        val seoul = LatLng(37.0, 126.0)
        googleMap.addMarker(MarkerOptions().position(seoul).title("Marker in Seoul"))
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(seoul))

        val ski1 = LatLng(37.2924, 128.1454)
        googleMap.addMarker(MarkerOptions().position(ski1).title("Marker in Ski1"))
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(ski1))

    }



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_map, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val mapFragment = childFragmentManager.findFragmentById(R.id.map) as SupportMapFragment?
        mapFragment?.getMapAsync(callback)
    }
}