export default function Count({ data, label }) {
  return (
    <div>
      <h4>
        {label ? label : "Regular Count:"} {data}
      </h4>
    </div>
  );
}
