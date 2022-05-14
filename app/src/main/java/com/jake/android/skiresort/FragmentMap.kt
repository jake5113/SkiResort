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
        val konjiam = LatLng(37.336944, 127.293611)
        googleMap.addMarker(MarkerOptions().position(konjiam).title("곤지암리조트"))
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(konjiam))

        val bears = LatLng(37.798056, 127.247222)
        googleMap.addMarker(MarkerOptions().position(bears).title("베어스타운 리조트"))
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(bears))

        val yangji = LatLng(37.211944, 127.295)
        googleMap.addMarker(MarkerOptions().position(yangji).title("양지 파인 스키밸리"))
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(yangji))

        val jisan = LatLng(37.216667, 127.345278)
        googleMap.addMarker(MarkerOptions().position(jisan).title("지산 포레스트 리조트"))
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(jisan))

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