package d.vardanidze.healthylifestyle

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.recyclerview.widget.RecyclerView


class RecyclerViewAdapter(private val list: List<ViewItem>) :

    RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        return RecyclerViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.view_item,
                parent,
                false
            )
        )
    }



    class RecyclerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val workoutNameTextView = itemView.findViewById<EditText>(R.id.itemWorkoutId)
        val quantityTextView = itemView.findViewById<EditText>(R.id.itemQuantityId)

    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        holder.workoutNameTextView.setText(list[position].workout)
        holder.quantityTextView.setText(list[position].quantity.toString())

        holder.workoutNameTextView.setFocusable(false)
        holder.quantityTextView.setFocusable(false)


        holder.workoutNameTextView.setOnClickListener{
            // update database
        }

        holder.quantityTextView.setOnClickListener{
            // update database
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }


}