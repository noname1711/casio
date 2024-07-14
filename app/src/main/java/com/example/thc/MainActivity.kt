package com.example.thc

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.thc.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContent {
            setContentView(binding.root)

            binding.btnCong.setOnClickListener {
                val a = binding.edtNhapA.text.toString().toInt()
                val b = binding.edtNhapB.text.toString().toInt()
                val kq= a+b
                binding.edtKQ.setText(kq.toString())
            }

            binding.btnReset.setOnClickListener{
                binding.edtNhapA.setText("")
                binding.edtNhapB.setText("")
                binding.edtKQ.setText("")
                Toast.makeText(this,"đã xóa rồi nhé",Toast.LENGTH_SHORT).show()
            }

            binding.btn.setOnClickListener{
                Toast.makeText(this,"Bạn Hùng vip pro làm ra nhé =))",Toast.LENGTH_LONG).show()
            }

            var ChiaSe: View.OnClickListener? = null
            ChiaSe = View.OnClickListener {
                if (it == binding.btnTru)
                {
                    val a = binding.edtNhapA.text.toString().toInt()
                    val b = binding.edtNhapB.text.toString().toInt()
                    val kq= a-b
                    binding.edtKQ.setText(kq.toString())
                }
                else if (it == binding.btnNhan)
                {
                    val a =binding.edtNhapA.text.toString().toInt()
                    val b = binding.edtNhapB.text.toString().toInt()
                    val kq =a*b
                    binding.edtKQ.setText(kq.toString())
                }
                else if (it == binding.btnChia)
                {
                    val a = binding.edtNhapA.text.toString().toDouble()
                    val b = binding.edtNhapB.text.toString().toDouble()
                    val kq= a/b
                    binding.edtKQ.setText(kq.toString())
                }
            }
            binding.btnTru.setOnClickListener(ChiaSe)
            binding.btnNhan.setOnClickListener(ChiaSe)
            binding.btnChia.setOnClickListener(ChiaSe)

            var skNhanLau: View.OnLongClickListener? = null
            skNhanLau = View.OnLongClickListener {
                if (it == binding.btnNhanLau)
                {
                    Toast.makeText(this,"giữ là pay màu nút này",Toast.LENGTH_SHORT).show()
                    binding.btnNhanLau.visibility = View.GONE
                }
                true
            }
            binding.btnNhanLau.setOnLongClickListener(skNhanLau)

            binding.btnThoat.setOnClickListener{
                Toast.makeText(this, "Hùng víp pro!"+ "\nCảm ơn đã dùng app :3",Toast.LENGTH_LONG).show()
                finish()
            }
                }
            }
        }

